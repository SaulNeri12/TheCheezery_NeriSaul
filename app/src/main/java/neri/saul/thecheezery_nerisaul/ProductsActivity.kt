package neri.saul.thecheezery_nerisaul

import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import neri.saul.thecheezery_nerisaul.adapters.ProductsAdapter

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productsList: ListView = findViewById(R.id.products_list) as ListView
        val productsCategoryImage: ImageView = findViewById(R.id.category)

        val products = intent.getSerializableExtra("products_list") as? ArrayList<Product>?
        val productsCategory = intent.getIntExtra("products_category", 0)
        var adapter = ProductsAdapter(this, products)
        productsList.adapter = adapter

        // cambia el nombre del titulo
        if (productsCategory != 0) {
            productsCategoryImage.setImageResource(productsCategory)
        }
    }
}