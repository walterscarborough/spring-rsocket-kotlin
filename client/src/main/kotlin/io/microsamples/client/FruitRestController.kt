package io.microsamples.client

import org.reactivestreams.Publisher
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FruitRestController(val rSocketRequester: RSocketRequester) {

    @GetMapping("/fruit")
    fun getFruit(): Publisher<Fruit> {
        return rSocketRequester
                .route("availableFruit")
                .data(FruitRequest(quantity = 1))
                .retrieveMono(Fruit::class.java)
    }
}
