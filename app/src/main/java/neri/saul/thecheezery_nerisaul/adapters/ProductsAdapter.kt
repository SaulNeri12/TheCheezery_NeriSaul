package neri.saul.thecheezery_nerisaul.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import neri.saul.thecheezery_nerisaul.Product
import neri.saul.thecheezery_nerisaul.R

class ProductsAdapter : BaseAdapter {
    private var products: ArrayList<Product> = ArrayList()
    private var context: Context? = null

    constructor(context: Context, products: ArrayList<Product>) {
        this.context = context
        this.products = products
    }

    override fun getCount(): Int {
        return this.products.size
    }

    override fun getItem(position: Int): Any {
        return this.products.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val product: Product = this.products.get(position)
        val inflator: LayoutInflater = LayoutInflater.from(this.context)
        val view = inflator.inflate(R.layout.product_view, null)

        val image: ImageView = view.findViewById(R.id.product_image) as ImageView
        val name: TextView = view.findViewById(R.id.product_name) as TextView
        val description: TextView = view.findViewById(R.id.product_description) as TextView
        val price: TextView = view.findViewById(R.id.product_price) as TextView

        image.setImageResource(product.image)
        name.setText(product.name)
        description.setText(product.description)
        price.setText("$${product.price}")

        return view
    }
}