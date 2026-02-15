package com.example.lib

fun main() {
    val productInventory: MutableList<Product> = mutableListOf<Product>()

    fun addProductToProductInventory(name: String, quantity:Int){
        val product: Product = Product(name, quantity)
        productInventory.add(product)

    }

    fun removeProductFromProductInventory(name: String) {
        val indexOfProductWeWantToRemove = productInventory.indexOfFirst { it.name == name } // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html
        productInventory.removeAt(indexOfProductWeWantToRemove)
    }

    fun displayCurrentInventory() {
        productInventory.forEach { product ->
            println(product)
        }
        println()
    }

    addProductToProductInventory("Iphone 17", 100)

    addProductToProductInventory("Iphone 15", 500)

    displayCurrentInventory()

    removeProductFromProductInventory("Iphone 15")

    displayCurrentInventory()
}

