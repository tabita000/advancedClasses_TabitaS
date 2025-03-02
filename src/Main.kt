//Test the class by instantiating 3 people, one on salary working 45 hours that week on first shift, one on hourly
// working 50 hours that week on second shift, and one on hourly working 35 hours that week, on third shift.
fun main() {
    val emp1 = Employee("Silvia Rufus", PositionTitle.ADMINISTRATION, true, 27.00, 1)
    val emp2 = Employee("Jessica Smith", PositionTitle.PRODUCTION, false, 15.00, 2)
    val emp3 = Employee("Joseph Klaus", PositionTitle.SALES, true, 20.00, 3)

    //employee details and calculate pay
    emp1.calculate(45.0)
    emp2.calculate(50.0)
    emp3.calculate(35.0)



}

