package io.microsamples.server

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import reactor.core.publisher.Mono

@Controller
class ChachkieRSocketController {

    @MessageMapping("availableChachkies")
    fun availableChachkies(): Mono<Chachkie> {
        return Mono.just(Chachkie(name = "pineapple"))
    }
}
