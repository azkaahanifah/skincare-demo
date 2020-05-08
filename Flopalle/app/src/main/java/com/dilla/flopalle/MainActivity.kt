package com.dilla.flopalle

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dilla.flopalle.adapter.BeautyDiyAdapter
import com.dilla.flopalle.model.BeautyDiy
import com.dilla.flopalle.model.BeautyDiyData
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {

    private lateinit var rvHealth: RecyclerView
    private var listDiy: ArrayList<BeautyDiy> = arrayListOf()
    private lateinit var beautyDiyAdapter: BeautyDiyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
                startActivity(moveData)
            }
        })
    }

}
