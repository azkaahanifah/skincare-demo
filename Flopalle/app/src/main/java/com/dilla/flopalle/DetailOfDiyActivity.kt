package com.dilla.flopalle

import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class DetailOfDiyActivity : AppCompatActivity() {

    companion object {
        const val PRODUCT_NAME = "product_name"
        const val PRODUCT_DETAIL = "product_detail"
        const val IMG_DIY = "image_diy"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_of_diy)

        val productNameReceived: TextView = findViewById(R.id.product_name_received)
        val productDetailReceived: TextView = findViewById(R.id.product_detail_received)
        val imgDiyReceived: CircleImageView = findViewById(R.id.img_diy_detail)

        val getProductName = intent.getStringExtra(PRODUCT_NAME)
        val getProductDetail = intent.getStringExtra(PRODUCT_DETAIL)
        val getImageDiy = intent.getByteArrayExtra(IMG_DIY)

        val decodedImage = BitmapFactory.decodeByteArray(getImageDiy, 0, getImageDiy.size)

        productNameReceived.text = getProductName
        productDetailReceived.text = getProductDetail
        imgDiyReceived.setImageBitmap(decodedImage)
    }

}