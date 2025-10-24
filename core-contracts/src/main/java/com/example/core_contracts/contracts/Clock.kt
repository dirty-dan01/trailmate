package com.example.core_contracts.contracts

import java.time.Instant

interface Clock {
    fun now(): Instant
}