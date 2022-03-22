package com.example.gofdesignpattern.week13_chain_of_responsibility._01_before

class Client {
    fun main(args: Array<String>) {
        val request = Request("무궁화 꽃이 피었습니다.")
        val requestHandler: RequestHandler = LoggingRequestHandler()
        requestHandler.handler(request)
    }
}
