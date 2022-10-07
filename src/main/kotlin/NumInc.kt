class NumInc() {
    var number: Int = 0
    var step: Int = 1

    constructor(num: Int, gap: Int) : this() {
        number = num
        step = gap
    }

    fun inc() { number += step }
    fun dec() { number -= step }
}