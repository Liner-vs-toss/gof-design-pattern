package com.example.gofdesignpattern.week08_composite._03_java

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextField

fun main() {
    val frame = JFrame()

    val textField = JTextField()
    textField.setBounds(200, 200, 200, 40)
    frame.add(textField)

    val button = JButton("click")
    button.setBounds(200, 100, 60, 40)
    button.addActionListener { e ->
        textField.text = "Hello"
    }
    frame.add(button)

    frame.setSize(600, 400)
    frame.layout()
    frame.isVisible = true
}
