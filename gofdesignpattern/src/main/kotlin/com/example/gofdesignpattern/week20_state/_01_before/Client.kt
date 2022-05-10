package com.example.gofdesignpattern.week20_state._01_before

fun main(args: Array<String>) {
    val student = Student("donghyun")
    val onlineCourse = OnlineCourse()
    val kim = Student("kim")
    kim.addPrivateCourse(onlineCourse)
    onlineCourse.addStudent(student)
    onlineCourse.changeState(OnlineCourse.State.PRIVATE)
    onlineCourse.addStudent(kim)
    onlineCourse.addReview("hello", student)
    println(onlineCourse.state)
    println(onlineCourse.getStudents())
    println(onlineCourse.getReviews())
}
