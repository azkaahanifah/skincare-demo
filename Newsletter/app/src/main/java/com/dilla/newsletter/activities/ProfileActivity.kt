package com.dilla.newsletter.activities

import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.dilla.newsletter.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    val PRIVATE_MODE = 0
    val PREF_NAME = "bitlabs"
    var sharedPref : SharedPreferences? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        sharedPref = this.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        user_profile_name.setText(sharedPref!!.getString("user-name", ""))
        user_profile_email.setText(sharedPref!!.getString("user-email", ""))
    }
}