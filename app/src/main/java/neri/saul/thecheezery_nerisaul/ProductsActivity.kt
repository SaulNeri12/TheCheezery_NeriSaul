package neri.saul.thecheezery_nerisaul

import android.os.Bundle
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import neri.saul.thecheezery_nerisaul.adapters.ProductsAdapter
import org.w3c.dom.Text

class ProductsActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val productsList: ListView = findViewById(R.id.products_list) as ListView
        val productsListHeaderName: TextView = findViewById(R.id.products_list_header)

        val products = intent.getSerializableExtra("products_list") as? ArrayList<Product>?
        val productsListName = intent.getStringExtra("products_list_name")
        var adapter = ProductsAdapter(this, products)
        productsList.adapter = adapter

        // cambia el nombre del titulo
        productsListHeaderName.setText(productsListName)
    }
}