package com.example.gofdesignpattern.week13_chain_of_responsibility._02_after

import com.example.gofdesignpattern.week13_chain_of_responsibility._01_before.Request

class AuthRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {
    override fun handle(request: Request) {
        println("인증이 되었는가?")
        super.handle(request)
    }
}
