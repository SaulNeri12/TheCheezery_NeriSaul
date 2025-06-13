package neri.saul.thecheezery_nerisaul

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuActivity :  AppCompatActivity() {

    private var coldDrinks = ArrayList<Product>()
    private var hotDrinks = ArrayList<Product>()
    private var sweets = ArrayList<Product>()
    private var salties = ArrayList<Product>()

    private var menuLoaded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        this.loadAllProducts()

        val coldDrinksBtn: Button = findViewById(R.id.button_cold_drinks)
        val hotDrinksBtn: Button = findViewById(R.id.button_hot_drinks)
        val sweetsBtn: Button = findViewById(R.id.button_sweets)
        val combosBtn: Button = findViewById(R.id.button_combos)
        val saltiesBtn: Button = findViewById(R.id.button_salties)
        val customBtn: Button = findViewById(R.id.button_custom)

        coldDrinksBtn.setOnClickListener {
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("products_category", R.drawable.cold_drinks);
            intent.putExtra("products_list", this.coldDrinks)
            startActivity(intent)
        }

        hotDrinksBtn.setOnClickListener {
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("products_category", R.drawable.hot_drinks);
            intent.putExtra("products_list", this.hotDrinks)
            startActivity(intent)
        }

        sweetsBtn.setOnClickListener {
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("products_category", R.drawable.sweets);
            intent.putExtra("products_list", this.sweets)
            startActivity(intent)
        }

        saltiesBtn.setOnClickListener {
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra("products_category", R.drawable.salties);
            intent.putExtra("products_list", this.salties)
            startActivity(intent)
        }
    }


    fun loadAllProducts(): Unit {

        if (menuLoaded) {
            return
        }

        coldDrinks.add(Product("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3))
        coldDrinks.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4))
        coldDrinks.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7))
        coldDrinks.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7))

        hotDrinks.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6))
        hotDrinks.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5))
        hotDrinks.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4))
        hotDrinks.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6))
        hotDrinks.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7))
        hotDrinks.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2))

        sweets.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6))
        sweets.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3))
        sweets.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4))
        sweets.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6))
        sweets.add(Product("Cherry cheesecake", R.drawable.strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7))
        sweets.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6))

        salties.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6))
        salties.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5))
        salties.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread served warmed by grilling.", 4))
        salties.add(Product("Philly cheese steak", R.drawable.phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6))
        salties.add(Product("Nachos", R.drawable.nachos, "Tortilla chips layered with beef and melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.", 7))

        this.menuLoaded = true
    }
}