package com.example.gofdesignpattern.week20_state._01_before


class OnlineCourse {
    enum class State {
        DRAFT, PUBLISHED, PRIVATE
    }

    var state = State.DRAFT
    private val reviews: MutableList<String> = ArrayList()
    private val students: MutableList<Student> = ArrayList<Student>()

    fun addReview(review: String, student: Student) {
        if (state == State.PUBLISHED) {
            reviews.add(review)
        } else if (state == State.PRIVATE && students.contains(student)) {
            reviews.add(review)
        } else {
            throw UnsupportedOperationException("리뷰를 작성할 수 없습니다.")
        }
    }

    fun addStudent(student: Student) {
        if (state == State.DRAFT || state == State.PUBLISHED) {
            students.add(student)
        } else if (state == State.PRIVATE && availableTo(student)) {
            students.add(student)
        } else {
            throw UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.")
        }
        if (students.size > 1) {
            state = State.PRIVATE
        }
    }

    fun changeState(newState: State) {
        state = newState
    }

    fun getReviews(): List<String> {
        return reviews
    }

    fun getStudents(): List<Student> {
        return students
    }

    private fun availableTo(student: Student): Boolean {
        return student.isEnabledForPrivateClass(this)
    }
}
