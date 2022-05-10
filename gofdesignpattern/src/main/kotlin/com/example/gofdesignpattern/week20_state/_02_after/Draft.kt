package com.example.gofdesignpattern.week20_state._02_after

import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private


class Draft(private val onlineCourse: OnlineCourse) : State {
    override fun addReview(review: String, student: Student) {
        throw UnsupportedOperationException("드래프트 상태에서는 리뷰를 남길 수 없습니다.")
    }

    override fun addStudent(student: Student) {
        onlineCourse.students.add(student)
        if (onlineCourse.students.size > 1) {
            onlineCourse.changeState(Private(onlineCourse))
        }
    }
}
