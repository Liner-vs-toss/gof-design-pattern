package com.example.gofdesignpattern.week13_chain_of_responsibility._01_before

class LoggingRequestHandler : RequestHandler() {
    override fun handler(request: Request) {
        println("logging handler")
        super.handler(request)
    }
}
