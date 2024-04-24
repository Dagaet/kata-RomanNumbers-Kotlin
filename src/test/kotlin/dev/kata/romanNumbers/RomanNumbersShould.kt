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
    fun `Should not contain more than three symbols of base 1`() {
        val romanNumbers = RomanNumbers()
        val result = romanNumbers.romanNumberCreator(3)
        val result2 = romanNumbers.romanNumberCreator(30)
        val result3 = romanNumbers.romanNumberCreator(300)
        assertThat(result3).isEqualTo("CCC")
        assertThat(result2).isEqualTo("XXX")
        assertThat(result).isEqualTo("III")
    }
    @Test
    fun `Should set nines like IX`() {
        val romanNumbers = RomanNumbers()
        val result = romanNumbers.romanNumberCreator(9)
        val result2 = romanNumbers.romanNumberCreator(39)
        val result3 = romanNumbers.romanNumberCreator(309)
        assertThat(result3).isEqualTo("CCCIX")
        assertThat(result2).isEqualTo("XXXIX")
        assertThat(result).isEqualTo("IX")
    }
}
