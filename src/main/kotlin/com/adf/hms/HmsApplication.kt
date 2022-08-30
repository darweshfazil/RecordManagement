package com.adf.hms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HmsApplication

fun main(args: Array<String>) {
	runApplication<HmsApplication>(*args)
}
