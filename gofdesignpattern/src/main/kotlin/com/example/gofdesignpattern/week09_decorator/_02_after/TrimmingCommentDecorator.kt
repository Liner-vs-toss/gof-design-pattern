package com.example.gofdesignpattern.week09_decorator._02_after

class TrimmingCommentDecorator (
    val commentService: CommentService,
) : CommentDecorator(commentService)  {

    override fun addComment(comment: String) {
        super.addComment(trim(comment))
    }

    private fun trim(comment: String): String {
        return comment.replace("...", "")
    }
}
