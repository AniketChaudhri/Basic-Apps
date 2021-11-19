package com.aniket.kotlinpractice2

import kotlin.reflect.typeOf

class KotlinBasics {

}


@ExperimentalStdlibApi
fun main(){
    var name = "Aniket " + "Chaudhri"
    var myage = 20


//    println(myage::class.simpleName)
    var person1 = Person()
    var person2 = Person("Abhishek", "Chaudhri", 25)

    println("Person1 name is ${person1.firstname}")
    println("Person1 name is ${person2.firstname}")
//    println(person1.firstname)
}

interface Personality{
    var type: String
    var stars: Int

}
class Person(): Personality{
    var firstname: String? = null
    var lastname: String? = null
    var age: Int? = null
    var hobby: String? = null
    
    override var type: String
        get() = TODO("Not yet implemented")
        set(value) {}
    override var stars: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    constructor(firstname: String, lastname: String, age:Int) : this() {
        this.firstname = firstname
        this.lastname = lastname
        this.age = age

   }
    constructor(firstname: String, lastname: String) : this() {
        this.firstname = firstname
        this.lastname = lastname

    }




}
