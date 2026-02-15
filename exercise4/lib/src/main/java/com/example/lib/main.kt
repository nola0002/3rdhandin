package com.example.lib


fun main() {

    val words: List<String> = listOf<String>(
        "apple",
        "banana",
        "apple",
        "orange",
        "banana",
        "apple",
        "orange",
        "banana",
        "apple",
        "banana",
        "apple",
        "orange",
        "banana",
        "banana",
        "apple",
        "orange",
        "apple",
        "orange",
        "banana"
    )

    println(words)
    findFrequencyOfEachWordInList(words)


    val words2: List<String> = listOf<String>("cat", "cat", "dog", "cat", "snake", "cat", "dog")

    findFrequencyOfEachWordInList(words2)
}

fun findFrequencyOfEachWordInList(listOfWords: List<String>) {


    listOfWords.forEach { i ->
        println(i)
        var wordCounter = 0
        listOfWords.forEach { j ->
            if (i == j) {
                wordCounter++
            }
        }
        println(wordCounter)
    }
}
