// SLf4j 1.7 can accidentially be pulled in using Spring Boot 3 leading to exceptions
// https://github.com/spring-projects/spring-boot/issues/33854
@file:DependsOn("org.springframework.boot:spring-boot-starter-web:2.7.9")
//@file:DependsOn("org.slf4j:slf4j-api:2.0.7")
//@file:DependsOn("ch.qos.logback:logback-classic:1.4.6")

import org.springframework.boot.*
import org.springframework.boot.autoconfigure.*
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class HelloController {
    @GetMapping("/hello")
    fun helloKotlin(): String {
        return "hello world"
    }
}

@SpringBootApplication
open class ReplApplication

fun main(args: Array<String>) {
    SpringApplication(ReplApplication::class.java).run(*args)
}

main(arrayOf("server.port=8083"))
