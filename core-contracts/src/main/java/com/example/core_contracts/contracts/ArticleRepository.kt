package com.example.core_contracts.contracts

import com.example.core_contracts.models.Article
import kotlinx.coroutines.flow.Flow

interface ArticleRepository {
    fun stream(): Flow<List<Article>>
    suspend fun refresh(): Result<Unit>
    suspend fun toggleSaved(id: String): Result<Unit>
}