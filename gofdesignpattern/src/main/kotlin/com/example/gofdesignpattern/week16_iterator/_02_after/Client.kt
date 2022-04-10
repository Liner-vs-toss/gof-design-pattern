package com.example.gofdesignpattern.week16_iterator._02_after

import java.util.Stack

fun main() {
    val board = Board()
    board.addPost("디자인 패턴 게임")
    board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?")
    board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.")

    val posts = board.getPosts()

    println(posts.iterator())

    for (i in 0 until posts.size) {
        val post = posts[i]
        println(post.title)
    }

    val recentPostIterator = board.getRecentPostIterator()
    while(recentPostIterator.hasNext()) {
        println(recentPostIterator.next().title)
    }

    val intStack = Stack<Int>()
    intStack.push(1)
    intStack.push(2)
    intStack.push(3)

    val iterator = intStack.iterator()
    println(iterator)
    while (iterator.hasNext()){
        println(iterator.next())
    }
}
