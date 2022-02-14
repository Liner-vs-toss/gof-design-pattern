package com.example.gofdesignpattern.week09_decorator._02_after

private val enabledSpamFilter = true

private val enabledTrimming = false

fun main(args: Array<String>) {
    var commentService: CommentService = DefaultCommentService()
    if (enabledSpamFilter) {
        commentService = SpamFilteringDecorator(commentService)
    }
    if (enabledTrimming) {
        commentService = TrimmingCommentDecorator(commentService)
    }
    val client = Client(commentService)
    client.writeComment("오징어게임")
    client.writeComment("보는게 하는거 보다 재밌을 수가 없지...")
    client.writeComment("http://whiteship.me")
}
