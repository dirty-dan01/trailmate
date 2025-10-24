package com.example.core_contracts.models

import java.time.Instant

data class UserSession(
    val userId: String,
    val token: String,
    val expiresAt: Instant,
)
