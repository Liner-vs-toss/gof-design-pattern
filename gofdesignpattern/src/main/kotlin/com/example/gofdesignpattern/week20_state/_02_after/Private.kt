package com.example.gofdesignpattern.week20_state._02_after

class Private(private val onlineCourse: OnlineCourse) : State {
    override fun addReview(review: String, student: Student) {
        if (onlineCourse.students.contains(student)) {
            onlineCourse.reviews.add(review)
        } else {
            throw UnsupportedOperationException("프라이빗 코스를 수강하는 학생만 리뷰를 남길 수 있습니다.")
        }
    }

    override fun addStudent(student: Student) {
        if (student.isAvailable(onlineCourse)) {
            onlineCourse.students.add(student)
        } else {
            throw UnsupportedOperationException("프라이빛 코스를 수강할 수 없습니다.")
        }
    }
}
