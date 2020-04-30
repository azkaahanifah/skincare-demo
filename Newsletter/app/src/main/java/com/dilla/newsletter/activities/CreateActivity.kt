package com.dilla.newsletter.activities

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dilla.newsletter.R
import com.dilla.newsletter.helper.NewsletterDBHelper
import kotlinx.android.synthetic.main.activity_create_news.*
import kotlinx.android.synthetic.main.activity_main.*

class CreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_create_news)
        btn_insert.setOnClickListener{
            insertNews()
            Toast.makeText(this, "Success Insert Data", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@CreateActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun insertNews() {
        val db = NewsletterDBHelper(this)
        val news = News(input_title.text.toString(),
                        input_body.text.toString(),
                        input_date.text.toString())
        db.insertNews(news)
    }
}