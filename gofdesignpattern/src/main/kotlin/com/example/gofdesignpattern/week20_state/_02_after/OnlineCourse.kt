package com.example.gofdesignpattern.week20_state._02_after

class OnlineCourse {
    var state: State = Draft(this)
    val students: MutableList<Student> = mutableListOf()
    val reviews: MutableList<String> = mutableListOf()

    fun addStudent(student: Student) {
        state.addStudent(student)
    }

    fun addReview(review: String, student: Student) {
        state.addReview(review, student)
    }

    fun changeState(state: State) {
        this.state = state
    }
}
