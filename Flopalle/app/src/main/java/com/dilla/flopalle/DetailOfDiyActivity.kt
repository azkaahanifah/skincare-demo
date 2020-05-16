package com.dilla.flopalle

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.hdodenhof.circleimageview.CircleImageView
import org.w3c.dom.Text

class DetailOfDiyActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val PRODUCT_NAME = "product_name"
        const val PRODUCT_DETAIL = "product_detail"
        const val IMG_DIY = "image_diy"
        const val ING_NAME = "ingredient_name"
        const val STEP_DIY = "step_diy"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_of_diy)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnShare: FloatingActionButton = findViewById(R.id.btn_share)
        btnShare.setOnClickListener {
            Toast.makeText(this@DetailOfDiyActivity, "Successfully Share", Toast.LENGTH_SHORT).show()
        }
        showDetailOfDiy()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showDetailOfDiy() {
        val productNameReceived: TextView = findViewById(R.id.product_name_received)
        val productDetailReceived: TextView = findViewById(R.id.product_detail_received)
        val imgDiyReceived: CircleImageView = findViewById(R.id.img_diy_detail)
        val ingredientNameDiy: TextView = findViewById(R.id.ingredient_name)
        val stepOfDiy: TextView = findViewById(R.id.step_diy)

        val getProductName = intent.getStringExtra(PRODUCT_NAME)
        val getProductDetail = intent.getStringExtra(PRODUCT_DETAIL)
        val getImageDiy = intent.getByteArrayExtra(IMG_DIY)
        val getIngredientName = intent.getStringExtra(ING_NAME)
        val getStepOfDiy = intent.getStringExtra(STEP_DIY)

        val decodedImage = BitmapFactory.decodeByteArray(getImageDiy, 0, getImageDiy.size)

        productNameReceived.text = getProductName
        productDetailReceived.text = getProductDetail
        imgDiyReceived.setImageBitmap(decodedImage)
        ingredientNameDiy.text = getIngredientName
        stepOfDiy.text = getStepOfDiy
    }

    override fun onClick(v: View?) {
        val intent = Intent(Intent.ACTION_SEND)
        startActivity(Intent.createChooser(intent, "Share with"))
    }

}