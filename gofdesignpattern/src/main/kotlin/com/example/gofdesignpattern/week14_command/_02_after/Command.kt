package com.example.gofdesignpattern.week14_command._02_after

/**
 * 커맨드 인터페이스
 * @see Runnable 리턴하는 건 없고 뭔가를 실행하는 메소드만 정의되어 있음
 */
interface Command {
    fun execute()
    fun undo()
}
