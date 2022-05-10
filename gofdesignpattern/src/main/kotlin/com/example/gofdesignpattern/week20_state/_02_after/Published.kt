package com.example.gofdesignpattern.week20_state._02_after

class Published(private val onlineCourse: OnlineCourse) : State {
    override fun addReview(review: String, student: Student) {
        onlineCourse.reviews.add(review)
    }

    override fun addStudent(student: Student) {
        onlineCourse.students.add(student)
    }
}
