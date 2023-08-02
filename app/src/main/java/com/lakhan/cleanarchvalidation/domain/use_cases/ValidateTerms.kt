package com.lakhan.cleanarchvalidation.domain.use_cases

class ValidateTerms {
    fun execute (acceptedTerms: Boolean): ValidationResult {
        if (!acceptedTerms){
            return ValidationResult(
                successful = false,
                errorMessage = "you must have to accept the terms"
            )
        }
        return ValidationResult(
            successful = true
        )
    }
}