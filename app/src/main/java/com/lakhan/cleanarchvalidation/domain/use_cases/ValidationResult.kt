package com.lakhan.cleanarchvalidation.domain.use_cases

data class ValidationResult(
    val successful: Boolean = false,
    val errorMessage: String? = null
)
