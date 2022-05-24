package com.example.gofdesignpattern.week22_template_method.java

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.client.RestTemplate

fun main() {
    // JdbcTemplate
    val jdbcTemplate = JdbcTemplate();
    jdbcTemplate.execute("insert");

    // RestTemplate
    val restTemplate = RestTemplate();

    val headers = HttpHeaders();
    headers.setAccept(listOf(MediaType.APPLICATION_JSON));
    headers.set("X-COM-PERSIST", "NO");
    headers.set("X-COM-LOCATION", "USA");

    val entity = HttpEntity<String>(headers);
    val responseEntity = restTemplate
        .exchange("http://localhost:8080/users", HttpMethod.GET, entity, String::class.java)
}
