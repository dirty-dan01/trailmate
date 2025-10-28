package com.example.core_contracts.contracts

interface RetryPolicy {
    suspend fun <T> run(block: suspend ()-> T): T
}