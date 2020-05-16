package com.dilla.flopalle

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class BiodataActivity : AppCompatActivity() {

    companion object {
        const val PROFILE_PHOTO = "profile_photo"
        const val PROFILE_NAME = "profile_name"
        const val PROFILE_BIO = "profile_bio"
        const val ADDRESS = "address"
        const val PHONE = "phone"
        const val EMAIL = "email"
        const val SITE = "site"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata_activity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnHire: Button = findViewById(R.id.btn_hire)
        val btnDownload: Button = findViewById(R.id.btn_download)
        btnHire.setOnClickListener { launchMailApp() }
        btnDownload.setOnClickListener { downloadCv() }
        showProfile()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showProfile() {
        val profilePhoto: CircleImageView = findViewById(R.id.profile_photo)
        val profileName: TextView = findViewById(R.id.profile_name)
        val profileBio: TextView = findViewById(R.id.profile_description)
        val profileAddress: TextView = findViewById(R.id.address)
        val profilePhone: TextView = findViewById(R.id.phone)
        val profileMail: TextView = findViewById(R.id.email)
        val profileSite: TextView = findViewById(R.id.website)

        val getProfilePhoto = intent.getByteArrayExtra(PROFILE_PHOTO)
        val getProfileName = intent.getStringExtra(PROFILE_NAME)
        val getProfileBio = intent.getStringExtra(PROFILE_BIO)
        val getProfileAddress = intent.getStringExtra(ADDRESS)
        val getProfilePhone = intent.getStringExtra(PHONE)
        val getProfileMail = intent.getStringExtra(EMAIL)
        val getProfileSite = intent.getStringExtra(SITE)

        val decodedImage = BitmapFactory.decodeByteArray(getProfilePhoto, 0, getProfilePhoto.size)

        profilePhoto.setImageBitmap(decodedImage)
        profileName.text = getProfileName
        profileBio.text = getProfileBio
        profileAddress.text = getProfileAddress
        profilePhone.text = getProfilePhone
        profileMail.text = getProfileMail
        profileSite.text = getProfileSite
    }

    private fun launchMailApp() {
        val intent = Intent(Intent.ACTION_SEND)
        val recipient = arrayOf("azkaahanifah@gmail.com")
        intent.putExtra(Intent.EXTRA_EMAIL, recipient)
        intent.type = "text/html"
        intent.`package` = "com.google.android.gm"
        startActivity(Intent.createChooser(intent, "Send Mail"))
    }

    private fun downloadCv() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=1XCEKdaHIoSsj1AnFlXZ-hIODyyj6sUFr"))
        startActivity(intent)
    }
}
