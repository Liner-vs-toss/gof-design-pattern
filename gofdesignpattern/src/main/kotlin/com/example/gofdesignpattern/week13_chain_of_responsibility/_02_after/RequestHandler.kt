package com.example.gofdesignpattern.week13_chain_of_responsibility._02_after

import com.example.gofdesignpattern.week13_chain_of_responsibility._01_before.Request

abstract class RequestHandler(private val nextHandler: RequestHandler?) {
    open fun handle(request: Request) {
        nextHandler?.handle(request)
    }
}
