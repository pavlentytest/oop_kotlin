import java.util.*

/*class Mobile {
    var brand: String = "Default"
    var model: String = ""
    var mrp: Float = 0f
    var discount: Float = 0f

    fun getActualPrice() = mrp - discount

    fun printDetails(){
        println("Mobile details:")
        println("Brand: $brand")
        println("Model: $model")
        println("MRP: $mrp")
        println("Discount: $discount")
    }
}*/
class Mobile (var brand: String, var model: String, var mrp: Float, var discount: Float) {


    // init function
    init {
        println("In init")
        // this.brand = brand.uppercase(Locale.getDefault())
        this.model = model.uppercase(Locale.getDefault())
        this.mrp = mrp
        this.discount = discount
    }

    companion object Test {
        var i: Int = 1
        fun printI(){
            println("Value of i: $i")
            i++
        }
    }
    // first secondary constructor
    constructor(_brand: String, _model: String) : this(_brand,_model, 100F, 20F) {
        this.brand = _brand
        this.model = _model
    }

    // second secondary constructor
    constructor(_mrp: Float, _discount: Float) : this("Default", "Def model", _mrp, _discount) {
        this.mrp = _mrp
        this.discount = _discount
    }


    // class methods
    fun getActualPrice() = mrp - discount


    fun printDetails(){
        println("Mobile details:")
        println("Brand: $brand")
        println("Model: $model")
        println("MRP: $mrp")
        println("Discount: $discount")

    }
}

class Person {
    var name: String = ""
    get() {
        println("Inside get() of name")
        return field
    }
    set(value) {
        println("Inside set() of name")
        if(value.length > 3) {
            println("Invalid name. You should enter the name less 3 symbols!")
        } else {
            field = value
        }
    }
}

