package com.example.gofdesignpattern.week09_decorator._01_before

class Client {

    private var commentService: CommentService

    constructor(commentService: CommentService){
        this.commentService = commentService
    }

    fun writeComment(comment: String) {
        commentService.addComment(comment)
    }
}

fun main(args: Array<String>) {
    val client: Client = Client(SpamFilteringCommentService())
    client.writeComment("오징어게임")
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
    client.writeComment("http://whiteship.me")
}
