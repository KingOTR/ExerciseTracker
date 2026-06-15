package com.example.rungps.strava

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class StravaOAuthMockTest {
    private lateinit var server: MockWebServer

    @Before
    fun setUp() {
        server = MockWebServer()
        server.start()
    }

    @After
    fun tearDown() {
        server.shutdown()
    }

    @Test
    fun tokenEndpoint_returnsAccessToken() {
        server.enqueue(
            MockResponse().setBody("""{"access_token":"test_token","expires_at":9999999999}"""),
        )
        val url = server.url("/oauth/token")
        val client = okhttp3.OkHttpClient()
        val response = client.newCall(
            okhttp3.Request.Builder().url(url).post(
                okhttp3.FormBody.Builder().add("grant_type", "authorization_code").build(),
            ).build(),
        ).execute()
        assertEquals(200, response.code)
        assertTrue(response.body?.string()?.contains("test_token") == true)
    }
}
