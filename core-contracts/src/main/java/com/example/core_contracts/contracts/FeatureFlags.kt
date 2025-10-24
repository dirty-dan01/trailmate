package com.example.core_contracts.contracts

interface FeatureFlags {
    fun isEnabled(key: String): Boolean
    fun <T> getValue(key: String, default: T): T
}