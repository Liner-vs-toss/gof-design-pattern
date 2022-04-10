package com.example.gofdesignpattern.week16_iterator._03_java

import java.io.FileInputStream
import javax.xml.namespace.QName
import javax.xml.stream.XMLInputFactory

fun main() {

    val xmlInputFactory : XMLInputFactory = XMLInputFactory.newInstance()
    val reader = xmlInputFactory.createXMLEventReader(FileInputStream("Book.xml"))

    while(reader.hasNext()) {
        val nextEvent = reader.nextEvent()
        if (nextEvent.isStartElement) {
            val startElement = nextEvent.asStartElement()
            val name = startElement.name
            if (name.localPart.equals("book")) {
                val title = startElement.getAttributeByName(QName("title"))
                println(title)
            }
        }
    }
}
