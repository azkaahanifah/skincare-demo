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

    private val diyDetail = arrayOf("Charcoal face shop seems to be everywhere right now, along with charcoal face masks and bath bombs. It's easy to understand why - charcoal is fantastic for the skin.",
                            "Some awesome benefits of using Himalayan Salt: 1) Detoxifies the body by balancing systemic pH. 2) Improves hydration by providing trace minerals. 3) Reduces muscle cramps by improving minerals and hydration.",
                            "Leave your skin feeling smooth with this! Additional tamanu oil and hazelnut oil are added because of their amazing skin benefits. In particular, they are great for oily skin types.",
                            "Lavender Clay Face Mask was specially formulated for dry and sensitive skin. Don't let the list of ingredients intimidate you - it's surprisingly easy to make!",
                            "Is the perfect way to celebrate fall and treat your skin at the same time. It's made with skin-loving ingredients such as pumpkin extract, pumpkin powder, and oat oil. Brazilian clay gives the mask a beautiful pumpkin orange hue.",
                            "The moringa tree is also known as the Miracle Tree and the Tree of Life. It's considered a superfood because the leaves are packed with vitamin's A, B, and C, manganese, and protein, and the seeds contain potassium, fiber, and magnesium.",
                            "Sea clay is a classic ingredients for facial masks. Sea clay has great absorption properties, which make it perfect for oily skin. This Sea Clay Face Mask was specifially formulated for oily skin with a combination of kaolin clay and sea clay.",
                            "Rose clay is a naturally beautiful skincare ingredient. It adds a soft, rosy hue to this Rose Clay Face Mask. This mask suitable for both dry and oil skin types. Scented with rose absolute, this face mask is luxurious and pampering.",
                            "Turmeric is a plant of the ginger family, and is usually used in dry powder form. Turmeric contains curcumin, whis is an anti-oxidant and is thought to have anti-inflammatory properties.",
                            "This mask is suitable for a variety of skin types. It's created by emulsifying oils with water, and then adding a mixture of dry ingredients like sea clay and spirulina powder. Cucumber seed oil is and excellent mouisturizer and absorbs quickly.")

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

    private val diyIngredientName = arrayOf("1.8 oz castor oil \n 1.8 oz tamanu oil \n 14.4 oz olive oil \n 9 oz coconut oil \n 9 oz palm oil \n 1 2/3 oz tea tree essential oil \n 10 1/8 oz distilled water \n 2 Tbsp activated charcoal \n 12 bar rectangle solicone mold \n 5.1 oz Sodium Hydroxide Lye",
                            "1 jar himalayan fine pink salt \n 9 oz virgin coconut oil",
                            "6 oz hazelnut oil \n 1/2 oz tamanu oil \n 3 ml tea tree essential oil \n 0.3 oz activated charcoal \n 10 oz natural castile liquid soap base \n 4 oz white jojoba beads - medium \n 11 oz kaolin clay \n 0.1 oz optiphen",
                            "21.4 oz distilled water \n 1 oz argan oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning wax \n 3.5 oz kaolin clay \n 1 oz purple brazilian clay \n 2 ml lavender 40/42 essential oil \n 0.5 ozevening primrose extract \n 0.2 oz optiphen",
                            "21.4 oz distilled water \n 1 oz oat oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning emulsifier \n 6 oz kaolin clay \n 0.3 oz dark red brazilian clay \n 1 oz pumpkin powder \n 0.5 oz pumpkin extract \n 0.2 ozoptiphen \n 3 ml cedarwood atlas essential oil",
                            "21.4 oz distilled water \n 1 oz moringa seed oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning emulsifier \n 6 oz kaolin clay \n 0.2 oz moringa leaf powder \n 2 ml spa essential oil blend \n 0.5 oz green tea extract \n 0.2 oz optiphen",
                            "21.4 oz distilled water \n 1 oz hazelnut oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning emulsifier \n 4 oz kaolin clay \n 4 oz sea clay \n 2 ml tea tree essential oil \n 0.5 oz ginseng extract \n 0.2 oz optiphen",
                            "21.4 oz distilled water \n 1 oz rose clay \n 3.5 oz kaolin clay \n 1 oz roseship seed oil \n 1.3 oz avocado oil \n 0.8 oz oz BTMS-50 conditioning emulsifier \n 1 oz polawax emulsifying wax \n 0.5 oz chamomile extract \n 0.2 oz optiphen \n 1 ml rose absolute",
                            "21.4 oz distilled water \n 1 oz meadowfoam oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning emulsifier \n 6 oz kaolin clay \n 0.2 oz turmeric powder \n 2 ml carrot seed essential oil \n 0.5 oz carrot extract \n 0.2 oz optiphen",
                            "21.4 oz distilled water \n 1 oz cucumber seed oil \n 1.3 oz avocado oil \n 1 oz polawax emulsifying wax \n 0.8 oz BTMS-50 conditioning emulsifier \n 5 oz kaolin clay \n 2 oz sea clay \n 0.4 oz spirulina powder \n 3 ml ginger essential oil \n 0.5 oz seaweed extract \n 0.2 oz optiphen")

    private val diyStep = arrayOf("1. Slowly and carefully add the lye to the water and gently stir until the lye has fully dissolved and the liquid is clear. Set aside to cool \n " +
                                    "2. Fully melt the castor oil, coconut oil, olive oil, palm oil and tamanu oil. Once the lye water and the oils have cooled to 130 degress or below \n " +
                                    "3. Add 2 Tbsp. activated charcoal to the soap. Use your stick blender to tap down the charcoal to start to mix it into the better \n " +
                                    "4. Add the tea tree essential oil to the soap, and use the stick blender to blend and stir the essential oil until completely mixed in \n" +
                                    "5. When the soap is a medium trace and is still pourable, pour the batter into the individual cavities of the 12 bar rectangle mold. Tap the mold on the counter to even the soap and get rid of bubbles \n" +
                                    "6. Spritz the top of the soap with 99% isopropyl alcohol to prevent soda ash. Place on a heating the soap for about 30 minutes \n" +
                                    "7. Turn off the heating pad and leave the soap insulated for 24 hours \n" +
                                    "8. Allow the soap to stay in the mold for at least 3-4 days. Because this soap has plenty of soft oils \n" +
                                    "9. Once the soap is firm enough, unmold and allow them to cure for 4-6 weeks",
                            "1. Measure out 1 and 1/2 cups of the tea salt in one bowl. And then measure out 1/3 cup of the coconut oil in the other bowl \n " +
                                    "2. Combine together in the large bowl with the large spoon. Mix well. You can use your hands to mix as well. Next until its completely combined \n" +
                                    "3. Once its mixed, transfer into your mason jars!",
                            "1. Add the natural castile liquid soap base, hazelnut and tamanu oil. Stir until completely combined. The mixture will take on a milky appearance \n " +
                                    "2. Add the tea tree essential oil and optiphen, Stir in completely \n" +
                                    "3. In a separate container, whisk together the kaolin clay, activated charcoal and jojoba beads until completely combined \n" +
                                    "4. Add the clay mixture into the liquid mixture in about 3-4 batches. Adding the dry ingredients in batches helps prevent the dry ingredients from poofing up \n" +
                                    "5. Continue mixing until completely combined with no clumps. Pour the scrub into jars and seal with the lid",
                            "1. In a heat-safe container, combine the avocado oil, argan oil, BTMS-50 and polawax. Heat the container in the microwave using 30-60 second bursts until the waves have fully melted \n" +
                                    "2. In a separate large container, heat the distiled water in the microwave until it reaches about 160-170 fahrenheit degree. Once the water reaches the correct temperature, some of it may evaporate \n " +
                                    "3. Check the temperatures of both containers. If the oil and wax mixture has cooled, place back into the microwave until fully melted \n " +
                                    "4. Begin adding heaping spoonfuls of the kaolin clay (or the kaolin clay and purple brazilian clay mixture) and pulsing the stick blender until combined \n" +
                                    "5. Continue adding the clay to the mixture and blending in a small amounts until all the clay is added \n" +
                                    "6. Stick blending for about 1-2 mninutes. Once the mixture is about 130-140 F celcius, add the optiphen, lavender essential oil and primrose extract. Stick blend till fully mixed \n " +
                                    "7. If not already added, add the purple brazilian clay and stick blend until the mixture is fully blended. Continue, just to make sure the ingredients are fully emulsified \n" +
                                    "8. Pour the mixture into the bail jars",
                            "1. Disinfect your utensils by dipping them in a 5% bleach water solution and allowing to dry \n" +
                                    "2. In a heat-safe container, combine 1.3 ounces of avocado oil, 1 ounce of oat oil, 0.8 ounce of BTMS-50 and 1 ounce of polawax emulsifying wax \n" +
                                    "3. In a small separate container, measure 6 ounces of kaolin clay, 0.3 ounces of dark red brazilian clay and 1 ounce of pumpkin powder. Mix to combine \n" +
                                    "4. In a separate large container, heat the distiled water in the microwwave untill it reaches about 160 F celcius \n" +
                                    "5. Check the temperatures of both container \n " +
                                    "6. Place the stick blender into the water and burp it to help get rid of bubbles \n" +
                                    "7. Add heaping sponfuls of the kaolin clay mixture and pulsing the stick blender until fully combined" +
                                    "8. Pour the mixture into the bail jars",
                            "1. Combine 1.3 oz of avocado oil, 1 oz of moringa seed oil, 0.8 oz of BTMSS-50 and 1 oz of polawax \n " +
                                    "2. Heat 21.4 oz of distilled water in the microwave until it reaches about 160-170 F celcius \n" +
                                    "3. Pour the oil and wax mixture into the water and use a spatula to make sure every little bit is added \n " +
                                    "4. Begin adding heaping spoonfuls of the kaolin clay and moringa leaf powder and pulsing the stick blender until combined \n" +
                                    "5. Continue to add the clay to the mixture and blend in small amounts untill all the clay is added \n" +
                                    "6. Once the mixture is about 130-140 F celcius, add 0.2 oz of optiphen, 2 ml of spa essential oil blend and 0.5 oz of green tea extract \n " +
                                    "7. Pour the miixture into the bails jars",
                            "1. In a heat-safe container, combine the avocado oil, hazelnut oil, BTMS-50 and polawax. Heat the container in the microwave using 30-60 seconds until the waves fully melted \n" +
                                    "2. Heat the distilled water in the microwave until it reaches about 160-170 F \n" +
                                    "3. Pour the oil and wax mixture into the water. Continue to pulse and stir for about a minute \n" +
                                    "4. Begin adding of the kaolin clay and sea clay and pulsing the stick blender until combined. Continue adding clay to the mixture and blending in small amounts until all the clay in added \n" +
                                    "5. Check the temperature of the mixture, about 130-140 F, add the optiphen, tea tree essential oil and gingseng extract. Stick blend until fully melted \n" +
                                    "6. Continue to stick blend for several minutes, just to make sure the ingredients are fully emulsified \n" +
                                    "7. Pour the mixture into bail jars",
                            "1. Combine the avocado oil, roseship seed oil, BTMS-50 and polawax. Heat the container in the microwave using 30-60 seconds \n" +
                                    "2. Heat the distilled water in the microwave. Remeasure and add more distilled water if necessary until you have 21.4 ounces of hot water \n" +
                                    "3. Pour the oil and wax mixture into the water and use a spatula to make sure every little bit is added. Continue to pulse and stir for about a minute \n" +
                                    "4. Begin adding heaping spoonfuls off the clay mixture and pulsing to the stick blender until combine \n" +
                                    "5. Continue adding the clay to the mixture and blending in small amount until the clay is added \n" +
                                    "6. Add the optiphen, rose absolute and chamomile extract. Stick blend the ingredients until fully mixed \n" +
                                    "7. Pour the mixture into bail jars",
                            "1. Combine the avocado oil, meadowfoam oil, BTMS-50 and polawax. Heat in the container in the microwave using 30-60 seconds burst until the waxes have fully melted \n" +
                                    "2. Heat the distilled water in the microwave until it reaches about 160-170 F degree. Remeasure and add more distilled water if necessary until you have 21.4 ounches of hot water \n" +
                                    "3. Check the temperature, should be about 160 F degree. If the oil and wax has cooled, place back into microwave until fully melted. Pour the oil and wax mixture into the water and use a spatula \n" +
                                    "4. Continue to pulse and stir for about a minute \n" +
                                    "5. Begin adding heaping spoonfuls of the kaolin clay and pulsing the stick blender until combined. Continue add the clay to the mixture and blending in small amounts \n" +
                                    "6. Check the temperature, add the optiphen, carrot seed essential oil and carrot extract. Stick blend the ingredients in until fully melted \n" +
                                    "7. Add the turmeric powder and stick blend until completely mixed in. Continue to blend, just to make sure the ingredients are fully emulsified \n" +
                                    "8. Pour the mixture into the bail jars",
                            "1. In a medium container, measure 5 ounces of kaolin clay, 2 ounces of sea clay, and 0.4 ounces of spirulina powder. Mix them together \n" +
                                    "2. Combine 1.3 ounces of avocado oil, 1 ounces of cucumber seed oil, 0.8 ounces of BTMS-50 and 1 ounces of polawax. Heat in the microwave using 30-60 seconds \n" +
                                    "3. Heat 21.4 ounces of distilled water in the microwave until it reaches about 160-170 F degree \n" +
                                    "4. Pour the oil and wax mixture into the water and use a spatula to make sure every little bit is added. Continue to pulse and stir for about a minute \n" +
                                    "5. Add heaping spoonfuls of the clay mixture and pulse the stick blender until combined \n" +
                                    "6. Continue blending for about 1-2 minutes. Use a spatula to scrape down any clay. Once the mixture, add 0.2 ounces of optiphen, 3 ml of ginger essential oil and 0.5 ounces of seaweed extract. Stick blend until fully mixed \n" +
                                    "7. Pour the mixture into the bail jars")

    val listDiy: ArrayList<BeautyDiy>
        get() {
            val list = arrayListOf<BeautyDiy>()
            for (position in diyName.indices) {
                val diy = BeautyDiy()
                diy.productName = diyName[position]
                diy.productDetail = diyDetail[position]
                diy.photo = diyImages[position]
                diy.ingredientName = diyIngredientName[position]
                diy.stepOfDiy = diyStep[position]
                list.add(diy)
            }
            return list
        }
}