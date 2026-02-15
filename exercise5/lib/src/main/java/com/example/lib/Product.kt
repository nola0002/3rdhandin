package com.example.lib

class Product(
    public val name: String,
    private var quantity: Int
) {


    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity)"
    }
}