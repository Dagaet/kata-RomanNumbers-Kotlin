package dev.kata.romanNumbers

class RomanNumbers {
    fun romanNumberCreator(numeriten: Int): String {
        var output: String = ""
        var numberTransform = numeriten
        for (i in numberTransform downTo 0){
            if (output.count{it == 'M'} < 3 && numberTransform >= 1000){
                output += "M"
                numberTransform -= 1000
            } else if (output.count{it == 'D'} == 0 && numberTransform >= 500){
                output += "D"
                numberTransform -= 500
            } else if (numberTransform >= 400){
                output += "CD"
                numberTransform -= 400
            } else if (output.count{it == 'C'} < 3 && numberTransform >= 100){
                output += "C"
                numberTransform -= 100
            }else if (numberTransform in 91..99){
                output += "XC"
                numberTransform -= 90
            } else if (output.count{it == 'L'} == 0 && numberTransform >= 50){
                output += "L"
                numberTransform -= 50
            } else if (numberTransform >= 40){
                output += "XL"
                numberTransform -= 40
            } else if (output.count{it == 'X'} < 3 && numberTransform >= 10){
                output += "X"
                numberTransform -= 10
            }else if (numberTransform == 9){
                output += "IX"
                numberTransform -= 0
            } else if (output.count{it == 'V'} == 0 && numberTransform >= 5){
                output += "V"
                numberTransform -= 5
            } else if (numberTransform == 4){
                output += "IV"
                numberTransform -= 0
            } else if (output.count{it == 'I'} < 3 && numberTransform >= 1){
                output += "I"
                numberTransform--
            }
        }
        return output
    }
}
