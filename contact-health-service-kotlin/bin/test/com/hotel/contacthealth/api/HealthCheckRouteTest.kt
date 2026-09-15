package com.hotel.contacthealth.api

import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.contentType
import io.ktor.server.testing.testApplication
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@DisplayName("Health Check Route Integration Tests")
class HealthCheckRouteTest {

    @Test
    @DisplayName("GET /healthz should respond HTTP 200 OK with status UP and JSON content-type")
    fun testHealthCheck() = testApplication {
        withTestApp {
            val response = get("/healthz")
            assertEquals(HttpStatusCode.OK, response.status)
            assertTrue(response.contentType()?.match(ContentType.Application.Json) == true)
            assertEquals("""{"status":"UP"}""", response.bodyAsText().trim())
        }
    }
}
