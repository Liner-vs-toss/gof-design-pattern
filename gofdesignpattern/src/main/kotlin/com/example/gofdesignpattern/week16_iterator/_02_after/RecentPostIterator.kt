package com.example.gofdesignpattern.week16_iterator._02_after

class RecentPostIterator : Iterator<Post> {
    private val internalIterator: Iterator<Post>

    constructor(board: Board) {
        val posts = board.getPosts()

        this.internalIterator = posts.sortedByDescending { it.createdDateTime }.iterator()
    }

    override fun hasNext(): Boolean {
        return internalIterator.hasNext()
    }

    override fun next(): Post {
        return internalIterator.next()
    }
}
