package com.example.gofdesignpattern.week19_observer._02_after

fun main() {
    val chatServer = ChatServer()
    val user1 = User(name = "toss core")
    val user2 = User(name = "toss bank")

    // observer 등록
    chatServer.register(topic = "오징어게임", subscriber = user1)
    chatServer.register(topic = "오징어게임", subscriber = user2)

    chatServer.register(topic = "디자인패턴", subscriber = user1)

    // 메시지 전송
    chatServer.sendMessage(topic = "오징어게임", message = "아.. 이름이 기억났어.. 일남이야.. 오일남")
    chatServer.sendMessage(topic = "디자인패턴", message = "옵저버 패턴으로 만든 채팅")

    chatServer.unregister(topic = "디자인패턴", subscriber = user1)
}
