package io.microsamples.client

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.rsocket.RSocketRequester
import org.springframework.util.MimeTypeUtils

@Configuration
class ClientConfiguration {
    @Bean
    fun rSocketRequester(rSocketRequesterBuilder: RSocketRequester.Builder): RSocketRequester {
        return rSocketRequesterBuilder
                .dataMimeType(MimeTypeUtils.APPLICATION_JSON)
                .connectTcp("localhost", 7000)
                .block()!!
    }
}
