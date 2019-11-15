package io.microsamples.client

import org.reactivestreams.Publisher
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChachkieRestController(val rSocketRequester: RSocketRequester) {

    @GetMapping("/chachkies")
    fun getFruit(): Publisher<Chachkie> {
        return rSocketRequester
                .route("availableChachkies")
                .data(ChachkieRequest(quantity = 1))
                .retrieveMono(Chachkie::class.java)
    }
}
