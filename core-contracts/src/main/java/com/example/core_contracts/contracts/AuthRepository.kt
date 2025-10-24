package com.example.core_contracts.contracts

import com.example.core_contracts.models.UserSession
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<UserSession>
    suspend fun logout()
    fun session(): Flow<UserSession?>
}