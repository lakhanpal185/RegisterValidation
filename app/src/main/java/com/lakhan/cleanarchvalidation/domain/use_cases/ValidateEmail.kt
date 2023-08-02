package com.lakhan.cleanarchvalidation.domain.use_cases

import android.util.Patterns

class ValidateEmail  {
    fun execute (email: String): ValidationResult {
        if (email.isBlank()){
            return ValidationResult(
                successful = false,
                errorMessage = "The email message should not be blank"
            )
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return ValidationResult(
                successful = false,
                errorMessage = "The email is not valid"
            )
        }
        return ValidationResult(
                successful = true,
        )
    }
}