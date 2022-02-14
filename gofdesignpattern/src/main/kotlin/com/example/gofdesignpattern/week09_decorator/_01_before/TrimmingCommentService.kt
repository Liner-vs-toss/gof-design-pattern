package com.example.gofdesignpattern.week09_decorator._01_before

class TrimmingCommentService : CommentService() {
    override fun addComment(comment: String) {
        super.addComment(trim(comment)!!)
    }

    private fun trim(comment: String): String {
        return comment.replace("...", "")
    }
}
