package com.example.lib

import java.time.LocalDate
import kotlin.math.max


open class RedditPost (
    private val author: String,
    private val title: String,
    upVotes: Int = 1,
    downVotes: Int = 1
) {
    private val publishingDate: LocalDate = LocalDate.now() // https://www.programiz.com/kotlin-programming/examples/current-date-time


    private var rawUpVotes: Int = upVotes

    private var rawDownVotes: Int = downVotes


    private val upVotes: Int
        get() = max(rawUpVotes - rawDownVotes, 0)  // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.math/max.html // https://www.youtube.com/watch?v=rlJHzsgUwos

    private val downVotes: Int
        get() = max(rawDownVotes - rawUpVotes, 0)  // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.math/max.html // https://www.youtube.com/watch?v=rlJHzsgUwos


    fun upVoteDownVoteUpdater(upVotes: Int, downVotes: Int){
        rawUpVotes = upVotes
        rawDownVotes = downVotes
    }

    public override fun toString(): String {
        return "RedditPost(author='$author', title='$title', publishingDate=$publishingDate, rawUpVotes=$rawUpVotes, rawDownVotes=$rawDownVotes, upVotes=$upVotes, downVotes=$downVotes)"
    }


}