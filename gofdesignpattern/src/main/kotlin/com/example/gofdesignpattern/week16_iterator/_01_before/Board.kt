package com.example.gofdesignpattern.week16_iterator._01_before

import com.example.gofdesignpattern.week16_iterator._02_after.RecentPostIterator

class Board {
    private val posts = mutableListOf<Post>()

    fun addPost(content: String) {
        val post = Post(content)
        posts.add(post)
    }

    fun getPosts(): List<Post> = posts
}
