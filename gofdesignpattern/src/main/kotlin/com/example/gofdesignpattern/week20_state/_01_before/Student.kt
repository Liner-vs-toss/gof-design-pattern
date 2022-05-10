package com.example.gofdesignpattern.week20_state._01_before


class Student(private val name: String) {
    private val privateCourses: MutableList<OnlineCourse> = ArrayList()
    fun isEnabledForPrivateClass(onlineCourse: OnlineCourse): Boolean {
        return privateCourses.contains(onlineCourse)
    }

    fun addPrivateCourse(onlineCourse: OnlineCourse) {
        privateCourses.add(onlineCourse)
    }

    override fun toString(): String {
        return "Student{" +
            "name='" + name + '\'' +
            '}'
    }
}
