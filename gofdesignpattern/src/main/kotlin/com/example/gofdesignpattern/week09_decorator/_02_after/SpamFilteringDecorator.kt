package com.example.gofdesignpattern.week09_decorator._02_after

class SpamFilteringDecorator(
    val commentService: CommentService,
) : CommentDecorator(commentService) {

    override fun addComment(comment: String) {
        if (isNotSpam(comment)) {
            super.addComment(comment)
        }
    }

    private fun isNotSpam(comment: String): Boolean {
        return !comment.contains("http")
    }
}
