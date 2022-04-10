package com.example.gofdesignpattern.week16_iterator._02_after

import java.time.LocalDateTime

class Post(
    val title: String,
    val createdDateTime: LocalDateTime = LocalDateTime.now(),
)
