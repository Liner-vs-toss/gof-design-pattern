package com.example.gofdesignpattern.week09_decorator._02_after

class DefaultCommentService : CommentService {
    override fun addComment(comment: String) {
        println(comment)
    }
}
