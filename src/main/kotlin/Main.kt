import java.util.*

fun main(args: Array<String>) {
    //  println("Hello World!")
    // https://code.tutsplus.com/ru/tutorials/kotlin-from-scratch-classes-and-objects--cms-29590
// https://www.studytonight.com/kotlin/kotlin-constructor-primary-and-secondary-constructor

    //val phone = Mobile()
    //phone.printDetails()
    // println(phone.brand)
    val mobile: Mobile = Mobile("iPhone", "12", 100000f, 1000f)
    println("Discounted price is: ${mobile.getActualPrice()}")
    mobile.printDetails()

    //  var nokia = Mobile("Nokia", "3310")
    // var xiomi = Mobile(400F,10F)

    Mobile.printI()
    Mobile.printI()

    val ivan = Person()
    ivan.name = "Max"
    println(ivan.name)

    var test = "sdfasdf asdfa sdfasdf"
    println(test.split(" ").map { it.first() })
}



