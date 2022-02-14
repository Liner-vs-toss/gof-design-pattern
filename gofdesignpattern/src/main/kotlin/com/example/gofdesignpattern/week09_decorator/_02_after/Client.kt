package com.example.gofdesignpattern.week09_decorator._02_after

class Client {

    private var commentService: CommentService

    constructor(commentService: CommentService) {
        this.commentService = commentService
    }

    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}
