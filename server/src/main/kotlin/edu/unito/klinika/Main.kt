package edu.unito.klinika

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KlinikaApplication

fun main(args: Array<String>) {
    runApplication<KlinikaApplication>(*args)
}
