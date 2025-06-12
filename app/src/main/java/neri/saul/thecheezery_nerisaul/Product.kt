package neri.saul.thecheezery_nerisaul

import java.io.Serializable

data class Product (
    var name: String,
    var image: Int,
    var description: String,
    var price: Int
) : Serializable