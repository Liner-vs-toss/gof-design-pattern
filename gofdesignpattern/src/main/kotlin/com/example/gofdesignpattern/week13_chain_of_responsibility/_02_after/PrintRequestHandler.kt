package com.example.gofdesignpattern.week13_chain_of_responsibility._02_after

import com.example.gofdesignpattern.week13_chain_of_responsibility._01_before.Request

class PrintRequestHandler(nextHandler: RequestHandler?) : RequestHandler(nextHandler) {
    override fun handle(request: Request) {
        println(request.body)
        super.handle(request)
    }
}
