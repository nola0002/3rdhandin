package com.example.lib

fun main(){

    val firstRedditPost: RedditPost = RedditPost("Noah", "Cats v Dogs")

    println(firstRedditPost)

    firstRedditPost.upVoteDownVoteUpdater(20000, 977)

    println(firstRedditPost)

    firstRedditPost.upVoteDownVoteUpdater(10000, 12097)

    println(firstRedditPost)

    val secondRedditPost: RedditPost = RedditPost("Kasper", "Tongue Tickler")

    secondRedditPost.upVoteDownVoteUpdater(1977, 1203)

    val listOfRedditPost: RedditFrontPage = RedditFrontPage(mutableListOf(firstRedditPost, secondRedditPost))

    println(listOfRedditPost)

    listOfRedditPost.deleteRedditPostByIndexNumber(0)

    println(listOfRedditPost)
}