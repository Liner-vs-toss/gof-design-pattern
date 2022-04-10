package com.example.gofdesignpattern.week16_iterator._01_before

import java.time.LocalDateTime

class Post(
    val title: String,
    val createdDateTime: LocalDateTime = LocalDateTime.now(),
)
