package com.example.gofdesignpattern.week20_state._02_after

interface State {
    fun addReview(review: String, student: Student)
    fun addStudent(student: Student)
}

