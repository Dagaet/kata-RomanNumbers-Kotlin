package dev.kata.romanNumbers

class RomanNumbers {
//    cambiar nombre
//    translate transform converse
    fun romanNumberCreator(numeriten: Int): String {
        var romanNumber: String = ""
        var numberTransform = numeriten
        for (i in numberTransform downTo 0){
            if (romanNumber.count{it == 'M'} < 3 && numberTransform >= 1000){
                romanNumber += "M"
                numberTransform -= 1000
            } else if (romanNumber.count{it == 'D'} == 0 && numberTransform >= 500){
                romanNumber += "D"
                numberTransform -= 500
            } else if (numberTransform >= 400){
                romanNumber += "CD"
                numberTransform -= 400
            } else if (romanNumber.count{it == 'C'} < 3 && numberTransform >= 100){
                romanNumber += "C"
                numberTransform -= 100
            }else if (numberTransform in 91..99){
                romanNumber += "XC"
                numberTransform -= 90
            } else if (romanNumber.count{it == 'L'} == 0 && numberTransform >= 50){
                romanNumber += "L"
                numberTransform -= 50
            } else if (numberTransform >= 40){
                romanNumber += "XL"
                numberTransform -= 40
            } else if (romanNumber.count{it == 'X'} < 3 && numberTransform >= 10){
                romanNumber += "X"
                numberTransform -= 10
            }else if (numberTransform == 9){
                romanNumber += "IX"
                numberTransform -= 9
            } else if (romanNumber.count{it == 'V'} == 0 && numberTransform >= 5){
                romanNumber += "V"
                numberTransform -= 5
            } else if (numberTransform == 4){
                romanNumber += "IV"
                numberTransform -= 4
            } else if (romanNumber.count{it == 'I'} < 3 && numberTransform >= 1){
                romanNumber += "I"
                numberTransform--
            }
        }
        return romanNumber
    }
}
