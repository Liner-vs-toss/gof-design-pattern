package com.example.gofdesignpattern.week22_template_method.java

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class MyHello: HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        super.doGet(req, resp)
    }

    override fun doPost(req: HttpServletRequest?, resp: HttpServletResponse?) {
        super.doPost(req, resp)
    }
}