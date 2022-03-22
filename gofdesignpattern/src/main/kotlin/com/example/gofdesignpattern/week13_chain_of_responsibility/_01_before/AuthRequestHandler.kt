package com.example.gofdesignpattern.week13_chain_of_responsibility._01_before

class AuthRequestHandler : RequestHandler() {
    override fun handler(request: Request) {
        println("auth handler")
        super.handler(request)
    }
}
