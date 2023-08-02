package com.lakhan.cleanarchvalidation.domain.use_cases

import android.util.Patterns

class ValidatePassword  {
    fun execute (password: String): ValidationResult {
        if (password.length > 8){
            return ValidationResult(
                successful = false,
                errorMessage = "The password must contains 8 characters"
            )
        }
        val containsDigitsAndLetters = password.any{ it.isDigit()} && password.any{ it.isLetter()}
        if (!containsDigitsAndLetters){
            return ValidationResult(
                successful = false,
                errorMessage = "The password must contains digits and letters"
            )
        }
        return ValidationResult(
                successful = true,
        )
    }
}