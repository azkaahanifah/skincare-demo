package com.dilla.flopalle.model

import com.dilla.flopalle.R

object BeautyDiyData {
    private val diyName = arrayOf("Charcoal Facial Soap",
                            "Himalayan Pink Salt Coconut Oil Scrub",
                            "Charcoal & Clay Face Scrub",
                            "Lavender Clay Face Mask",
                            "Pumpkin & Clay Face Mask",
                            "Moringa Clay Face Mask",
                            "Sea Clay Face Mask",
                            "Rose Clay Face Mask",
                            "Turmeric Clay Face Mask",
                            "Seaweed & Cucumber Clay Face Mask")

    private val diyDetail = arrayOf("Testing Charcoal Facial Soap",
                            "Testing Himalayan Pink Salt Coconut Oil Scrub",
                            "Testing Charcoal & Clay Face Scrub",
                            "Testing Lavender Clay Face Mask",
                            "Testing Pumpkin & Clay Face Mask",
                            "Testing Moringa Clay Face Mask",
                            "Testing Sea Clay Face Mask",
                            "Testing Rose Clay Face Mask",
                            "Testing Turmeric Clay Face Mask",
                            "Testing Seaweed & Cucumber Clay Face Mask")

    private val diyImages = intArrayOf(R.drawable.img_diy_first,
                                    R.drawable.img_diy_second,
                                    R.drawable.img_diy_third,
                                    R.drawable.img_diy_fourth,
                                    R.drawable.img_diy_fifth,
                                    R.drawable.img_diy_sixth,
                                    R.drawable.img_diy_seventh,
                                    R.drawable.img_diy_eigth,
                                    R.drawable.img_diy_nineth,
                                    R.drawable.img_diy_ten)

    val listDiy: ArrayList<BeautyDiy>
        get() {
            val list = arrayListOf<BeautyDiy>()
            for (position in diyName.indices) {
                val diy = BeautyDiy()
                diy.productName = diyName[position]
                diy.productDetail = diyDetail[position]
                diy.photo = diyImages[position]
                list.add(diy)
            }
            return list
        }
}