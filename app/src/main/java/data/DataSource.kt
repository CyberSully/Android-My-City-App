package data

import model.Category
import model.Place
import com.example.mycityapp.R

class Datasource {
    fun getCategories(): List<Category> {
        return listOf(
            Category(
                "Parks",
                R.drawable.the_japanese_tea_garden,  // Placeholder category image
                listOf(
                    Place(
                        name = "Central Park",
                        address = "50 E 5th Ave, San Mateo, CA 94401",
                        description = "Central Park is the first public park in San Mateo, California, spanning 16.5 acres." +
                                " It features a baseball field, tennis courts, sculptures, a playground, a recreation center," +
                                " a miniature train, a rose garden, and the San Mateo Arboretum." +
                                " The image shown portrays the Japanese Tea Garden, one of the park’s highlights.",
                        imageResId = R.drawable.the_japanese_tea_garden
                    ),
                    Place(
                        name = "Coyote Point Recreation Area",
                        address = "1701 Coyote Point Dr, San Mateo, CA",
                        description = "A 670-acre regional park known for windsurfing and sailing," +
                                      " featuring picnic areas, playgrounds, and the CuriOdyssey science museum and zoo.",
                        imageResId = R.drawable.coyote_point_park
                    ),
                    Place(
                        name = "Seal Point Park",
                        address = "1901 J Hart Clinton Dr, San Mateo, CA",
                        description = "A waterfront park offering scenic views of the San Francisco Bay," +
                                    " walking and biking trails, and a dog park.",
                        imageResId = R.drawable.sealpoint
                    ),
                    Place(
                        name = "Washington Park",
                        address = "1768 Washington St, San Mateo, CA",
                        description = "A local park featuring sports courts, open spaces," +
                                " and playgrounds, ideal for sports enthusiasts and families." +
                                "Great place for tennis!",
                        imageResId = R.drawable.washington_park
                    )
                )
            ),
            Category(
                "Restaurants",
                R.drawable.ic_launcher_background,
                listOf(
                    Place(
                        name = "Pancho Villa Taqueria",
                        address = "365 S B St, San Mateo, CA 94401",
                        description = "A popular Mexican restaurant known for its handcrafted," +
                                " made-to-order cuisine, including super burritos, tacos, fajitas, and a full Mexican menu." +
                                "My favorite Mexican food spot in San Mateo! ",
                        imageResId = R.drawable.pancho_villa
                    ),
                    Place(
                        name = "Sapporo Rock-N-Roll Sushi",
                        address = "2456 S El Camino Real, San Mateo, CA 94403",
                        description = "A Japanese restaurant offering a contemporary environment with fresh daily ingredients, " +
                                "known for its savory food and enjoyable atmosphere. My favorite sushi place in the area!",
                        imageResId = R.drawable.sapporo
                    ),
                    Place(
                        name = "The Fish Market",
                        address = "1855 S Norfolk St, San Mateo, CA 94403",
                        description = "A seafood restaurant offering fresh catches of the day, sushi bar, and a retail market" +
                                " in a casual waterfront setting.",
                        imageResId = R.drawable.fish_market
                    ),
                    Place(
                        name = "Himawari",
                        address = "202 2nd Ave, San Mateo, CA 94401",
                        description = "My favorite place for ramen, Himawari is a popular ramen restaurant located in downtown San Mateo," +
                                " California. Known for its diverse menu and inviting atmosphere, it offers a variety of ramen dishes, " +
                                "including the notable Tan Tan Men - a spicy sesame-flavored soup with ground pork, bean sprouts, and green onions." +
                                " The restaurant also serves appetizers like Ma-Bo Tofu and Chicken Karaage. The ambiance is enhanced by jazz music and eclectic decor, creating a cozy dining experience.",
                        imageResId = R.drawable.himawari
                    )
                )
            ),
            Category(
                "Coffee Shops",
                R.drawable.ic_launcher_background,
                listOf(
                    Place(
                        name = "Philz Coffee",
                        address = "113 S B St, San Mateo, CA 94401",
                        description = "A local chain known for custom-blended coffees made to your taste. Each cup is handcrafted," +
                                " ensuring a personalized experience. My favorite local place to grab a quick coffee!",
                        imageResId = R.drawable.philz
                    ),
                    Place(
                        name = "Blue Bottle Coffee",
                        address = "3081 S Delaware St, San Mateo, CA 94403",
                        description = "A local chain known for custom-blended coffees made to your taste. Each cup is handcrafted," +
                                " ensuring a personalized experience.",
                        imageResId = R.drawable.blue_bottle
                    ),
                    Place(
                        name = "3 Bees Coffee",
                        address = "224 E 3rd Ave, San Mateo, CA 94401",
                        description = "A locally owned café serving specialty coffee drinks alongside savory breakfast and " +
                                "lunch items in a relaxing atmosphere.",
                        imageResId = R.drawable._bees
                    ),
                    Place(
                        name = "Fiero Caffe",
                        address = "106 S El Camino Real, San Mateo, CA 94401",
                        description = "An Italian-inspired café offering a true Italian culinary experience complemented by " +
                                "speedy WiFi and ample comfy seating.",
                        imageResId = R.drawable.fiero
                    )
                )
            )
        )
    }
}
