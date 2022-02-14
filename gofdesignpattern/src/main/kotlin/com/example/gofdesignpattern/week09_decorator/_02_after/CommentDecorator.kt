package com.example.gofdesignpattern.week09_decorator._02_after

open class CommentDecorator(
    private val commentService: CommentService
) : CommentService {
    override fun addComment(comment: String) {
        commentService.addComment(comment)
    }
}
