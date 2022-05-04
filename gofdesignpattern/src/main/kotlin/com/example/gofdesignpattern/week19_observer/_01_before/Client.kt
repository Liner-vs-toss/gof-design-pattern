package com.example.gofdesignpattern.week19_observer._01_before

fun main() {
    val chatServer = ChatServer()

    val user1 = User(chatServer)
    user1.sendMessage(topic = "디자인패턴", message = "이번엔 옵저버 패턴입니다.")
    user1.sendMessage(topic = "토스 상장", message = "파이팅!")

    // user2가 직접 getter를 호출해서 가져와야 한다. (폴링 방식)
    val user2 = User(chatServer)
    println(user2.getMessage(topic = "디자인패턴"))

    user1.sendMessage(topic = "디자인패턴", message = "예제 코드 보는 중..")
    println(user2.getMessage(topic = "디자인패턴"))
}
