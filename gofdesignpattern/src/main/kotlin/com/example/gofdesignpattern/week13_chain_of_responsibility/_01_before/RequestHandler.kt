package com.example.gofdesignpattern.week13_chain_of_responsibility._01_before

open class RequestHandler {
    open fun handler(request: Request) {
        println(request.body)
    }
}
