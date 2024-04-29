package dev.kata.romanNumbers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

// Roman Numbers
// Should not contain more than 3 symbols of base 1
// Should not repeat numbers of base 2
// Should not subtract if they are from a superior order
// Should sum all the numbers passed

internal class RomanNumbersShould {
    @Test
    fun `Generate a basic given number`() {
        val romanNumbers = RomanNumbers()
        val result = romanNumbers.romanNumberCreator(1)
        val result2 = romanNumbers.romanNumberCreator(3)
        val result3 = romanNumbers.romanNumberCreator(5)
        assertThat(result).isEqualTo("I")
        assertThat(result2).isEqualTo("III")
        assertThat(result3).isEqualTo("V")
    }
}
