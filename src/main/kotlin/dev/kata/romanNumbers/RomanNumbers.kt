package dev.kata.romanNumbers

class RomanNumbers {
    fun romanNumberCreator(arabicValue: Int): String {
        var romanValue = ""
        var arabicValueTransform: Int = arabicValue
        RomanNumbersEnum.entries.forEach { romanNumbers ->
            while (arabicValueTransform >= romanNumbers.decimalValue) {
                arabicValueTransform -= romanNumbers.decimalValue
                romanValue += romanNumbers.romanValue
            }
        }
        return romanValue
    }
}


enum class RomanNumbersEnum(val romanValue: Char, val decimalValue: Int) {
    ONETHOUSAND('M',1000),
    FIVEHUNDRED('D', 500),
    ONEHUNDRED('C', 100),
    FIFTY('L', 50),
    FIVE('V', 5),
    ONE('I', 1)
}
