class employee(
    var name: String,
    var position: PositionTitle ,
    var salary: Boolean,
    var payRate: Double,
    var shift: Int
) {

    fun calculate(hoursIn: Double){
        var adjustedPayRate = payRate

        // Increased pay rate according to the shift
        if (shift == 2) {
            adjustedPayRate *= 1.25
        } else if (shift == 3) {
            adjustedPayRate *= 1.50
        }

        //calculate the earnings
        var earnings = adjustedPayRate * hoursIn

        // overtime for hourly employees
        if (!salary && hoursIn > 40) {
            val overtime = hoursIn - 40
            var overTimePay = overtime * 1.5 * adjustedPayRate
            earnings = 40 * adjustedPayRate + overTimePay
        }

        println("\n$name")
        println("$position is salary: $salary, shift: $shift")
        println("Rate of pay is: $%.2f per hour".format(adjustedPayRate))
        println("$name earned $%.2f this week".format(earnings))


    }





}