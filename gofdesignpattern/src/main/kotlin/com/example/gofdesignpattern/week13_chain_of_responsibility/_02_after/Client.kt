package com.example.gofdesignpattern.week13_chain_of_responsibility._02_after

import com.example.gofdesignpattern.week13_chain_of_responsibility._01_before.Request

class Client(val requestHandler: RequestHandler) {

    fun doWork() {
        val request = Request("이번 놀이는 뽑기입니다.")
        requestHandler.handle(request)
    }
}

fun main(args: Array<String>) {
    val chain = AuthRequestHandler(PrintRequestHandler(null))
    val client = Client(chain)
    client.doWork()
}
