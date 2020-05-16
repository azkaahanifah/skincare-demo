package com.dilla.flopalle

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dilla.flopalle.adapter.BeautyDiyAdapter
import com.dilla.flopalle.model.BeautyDiy
import com.dilla.flopalle.model.BeautyDiyData
import com.dilla.flopalle.model.Profile
import com.dilla.flopalle.model.ProfileData
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var rvHealth: RecyclerView
    private lateinit var beautyDiyAdapter: BeautyDiyAdapter
    private var listDiy: ArrayList<BeautyDiy> = arrayListOf()
    private var detailProfile = Profile()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnProfile: ImageView = findViewById(R.id.about_me)
        btnProfile.setOnClickListener {
            showProfile()
        }

        rvHealth = findViewById(R.id.rv_health)
        rvHealth.setHasFixedSize(true)

        listDiy.addAll(BeautyDiyData.listDiy)
        showRecyclerListDiy()
        showDetailDiy()
    }

    private fun showRecyclerListDiy() {
        rvHealth.layoutManager = LinearLayoutManager(this)
        beautyDiyAdapter = BeautyDiyAdapter(listDiy)
        rvHealth.adapter = beautyDiyAdapter
    }

    private fun showDetailDiy() {
            beautyDiyAdapter.setOnItemClickCallback(object: BeautyDiyAdapter.OnItemClickCallback {
            override fun onItemClick(data: BeautyDiy) {
                val bitmap = BitmapFactory.decodeResource(resources, data.photo)
                val stream = ByteArrayOutputStream()
                bitmap.compress(Bitmap.CompressFormat.JPEG, 50, stream)
                val byteArray = stream.toByteArray()

                val moveData = Intent(this@MainActivity, DetailOfDiyActivity::class.java)
                moveData.putExtra(DetailOfDiyActivity.PRODUCT_NAME, data.productName)
                moveData.putExtra(DetailOfDiyActivity.PRODUCT_DETAIL, data.productDetail)
                moveData.putExtra(DetailOfDiyActivity.IMG_DIY, byteArray)
                moveData.putExtra(DetailOfDiyActivity.ING_NAME, data.ingredientName)
                moveData.putExtra(DetailOfDiyActivity.STEP_DIY, data.stepOfDiy)
                startActivity(moveData)
            }
        })
    }

    private fun showProfile() {
        detailProfile = ProfileData.detailProfile
        val bitmap = BitmapFactory.decodeResource(resources, detailProfile.profilePhoto)
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 40, stream)
        val byteArray = stream.toByteArray()

        val moveProfile = Intent(this@MainActivity, BiodataActivity::class.java)
        moveProfile.putExtra(BiodataActivity.PROFILE_NAME, detailProfile.profileName)
        moveProfile.putExtra(BiodataActivity.PROFILE_BIO, detailProfile.profileBio)
        moveProfile.putExtra(BiodataActivity.PROFILE_PHOTO, byteArray)
        moveProfile.putExtra(BiodataActivity.ADDRESS, detailProfile.profileAddress)
        moveProfile.putExtra(BiodataActivity.PHONE, detailProfile.profilePhone)
        moveProfile.putExtra(BiodataActivity.EMAIL, detailProfile.profileMail)
        moveProfile.putExtra(BiodataActivity.SITE, detailProfile.profileSite)
        startActivity(moveProfile)
    }

}
