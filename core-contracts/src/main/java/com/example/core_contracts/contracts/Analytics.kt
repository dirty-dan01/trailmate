package com.example.core_contracts.contracts

import jdk.jfr.Event

interface Analytics {
    fun log(event: String, params: Map<String, Any?> = emptyMap())
}