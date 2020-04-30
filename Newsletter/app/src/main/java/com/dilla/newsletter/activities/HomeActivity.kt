package com.dilla.newsletter.activities

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dilla.newsletter.MainActivity
import com.dilla.newsletter.R
import com.dilla.newsletter.adapter.NewsAdapter
import com.dilla.newsletter.helper.NewsletterDBHelper
import com.dilla.newsletter.helper.NewsletterDBHelper.Companion.TABLE_NAME

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initRecycler()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.menu_profile -> {
                val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.menu_profile -> {
                val intent = Intent(this@HomeActivity, MainActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initRecycler() {
        val db = NewsletterDBHelper(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = NewsAdapter(db.getAllNews(), this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
    }

}