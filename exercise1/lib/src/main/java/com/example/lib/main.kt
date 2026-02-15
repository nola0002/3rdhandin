package com.example.lib

fun main(){
    val article1: Article = Article("Benny", "Cloud Fog")
    val article2: Article = Article("Tommy", "Frog tug of war")
    val article3: Article = Article("Susan", "Load up the machines")
    val article4: Article = Article("Noah", "Kelvin Harris meets god")
    val article5: Article = Article("Kasper", "Louder and louder")

    val listOfTheArticles: List<Article> = listOf<Article>(article1, article2, article3, article4, article5)

    listOfTheArticles.forEach { article ->
        println(article)
    }
    println(listOfTheArticles)

}