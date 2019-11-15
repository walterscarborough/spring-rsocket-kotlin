package io.microsamples.server

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class FruitRSocketController {

    @MessageMapping("availableFruit")
    fun availableFruit(): Mono<Fruit> {
        return Mono.just(Fruit(name = "pineapple"))
    }
}
