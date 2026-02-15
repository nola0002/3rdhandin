package com.example.lib

class RedditFrontPage(
    private var listOfRedditPosts: MutableList<RedditPost>

) {

    fun deleteRedditPostByIndexNumber(indexNumber: Int) {
        listOfRedditPosts.removeAt(indexNumber)
    }

    override fun toString(): String {
        return "RedditFrontPage(listOfRedditPosts=$listOfRedditPosts)"
    }


}


