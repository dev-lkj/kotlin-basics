package com.example.kotlinbasics



fun main(){
//    var myAge : Long = 23412341
//    println(myAge)
//    myAge = 36
//    println(myAge)
////    println("Hello Tony!")
//
//    var pi = 3.14f
//    println(pi)
//    pi = 3.1415926535f
//    println(pi)
//
//    var age: UShort = 35u
//    println(age)

//    var myTrue: Boolean = true
//    var myFalse: Boolean = false
//
//    println(myTrue || myFalse) // true
//    println(myTrue && myFalse) // false
//    println(!myTrue) // false


//    val myChar = '\u00AE'
//    val myChar = '\\'
//    val myChar = '\t'
//    println(myChar)

//    val str = "abcd 123"
//    for (c in str) {
//        println(c)
//    }

//    var firstName = "Tony"
//    var lastName = "Lee"
//    // name = "Very long paragraphs can be sotred inside of strings"
//    println(firstName + " " + lastName)

//    var age = 0
//    // greater than >
//    // lower than <
//    // greater equal >=
//    // lower equal <=
//    // euqal ==
//
//    println("Please enter your age as a full number")
////    read what the user has entered into the console
//    var enteredValue = readln()
//    // convert the string variable into an int variable
//    age = enteredValue.toInt()
////    age = readln().toInt()
//
//    if(age in 18..39){
//        // then execute what'is in here
//        println("You can go into the club")
//    }else if(age >= 40){
//        println("You are too old")
//    }else{
//        // if not true then execute this in here
//        println("You are yoo young to go into the club!")
//    }


    // while
//    var count = 0
//    while (count < 3){
//        // so long this content will be executed
//        println("Count is $count")
//        count++
//    }
//    println("Loop is done!")

//    var userInput = readln()
//    while (userInput == "1"){
//        println("While loop executed")
//        userInput = readln()
//    }
//    println("Loop is done!")

//    println("Enter number 1")
//    val num1Str = readln()
//    val num1Double = num1Str.toDouble()
//
//    println("Enter number 2")
//    val num2Str = readln()
//    val num2Double = num2Str.toDouble()
////    val myResult = add(num1Int, num2Int)
//    val myResult = divide(num1Double, num2Double)
//    println("The result is $myResult")

//        // Creating an object/instance of the calss Dog
//        var daisy = Dog("Daisy", "Dwarf poodle", 1)
//
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
//    println("A year has passed!")
////    daisy.name = "Hello world"
//    daisy.age = 2
//    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")

//    val coffeForDenis = CoffeeDetails(0, "denis", "xxl", 0)
//    makeCoffee(coffeForDenis)

    // Immutable list - you cannot add items after the initilization
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
//    shoppingList.add()
    // mutable list - you can add items later and modify
//    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")
//
//    // adding items to lists
//    shoppingList.add("Cooling System")
//    shoppingList.remove("Graphics Card RTX 3060")
//    shoppingList.add("Graphics Card RTX 4090")
//
//    println(shoppingList)
//    shoppingList.removeAt(2)
//    println(shoppingList)
//    shoppingList.removeAt(1)
//    println(shoppingList)
//    shoppingList.add(2, "RAM")
//    println(shoppingList)
//    println(shoppingList[3])
//
//    shoppingList[3] = "Graphics Card Rx 7800XT"
//    println(shoppingList) //[0][1][2][3][4]
//    shoppingList.set(1, "Water Cooling")
//    println(shoppingList)
//
//    val hasRam = shoppingList.contains("RAM")
//    if (hasRam) {
//        println("has RAM in the list")
//    }else {
//        println("No Ram in the list")
//    }
//
//    println(shoppingList.size)
////    for (index in 0 .. 3) {
////
////    }
//
//    for (index in 0 until shoppingList.size) {
//        println("item ${shoppingList[index]} is at index $index")
////        if (item == "RAM") {
////            shoppingList.removeLast()
////            break
////        }
//    }
//
//    println(shoppingList)

    var number: Int
    println("Please enter a number")
    try {
        // error prone code you want to execute
        number = readln().toInt()
        println("User entered $number")
    } catch (e: Exception) {
        // What should happen when an error occurs
        println("Error ${e.message}")
    }finally {
        number =0
//        println("This will be execute regardless. Error no error")
    }





}

//data class Portion()

/*
data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size:String,
    val creamAmount: Int
)



fun divide(num1:Double, num2:Double):Double{
    val result = num1/num2
    return result
}

fun add(num1:Int,num2:Int):Int{
    val result = num1 + num2
    return result
}

fun askCoffeeDetails(){
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    // Call Function
//    makeCoffee(sugarCountInt, name)
//    makeCoffee(2, "Jimmy")
//    makeCoffee(0, "Denis")
//    makeCoffee(3, "Candice")
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails){
    if(coffeeDetails.sugarCount == 1){
        println("Coffee with ${coffeeDetails.sugarCount}" +
                " spoons of sugar for $${coffeeDetails.name} + and cream:" +"${coffeeDetails.creamAmount}" )
    }else if(coffeeDetails.sugarCount == 0){
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar ${coffeeDetails.name} + and cream:\" +\"${coffeeDetails.creamAmount}\"")
    } else{
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar ${coffeeDetails.name} + and cream:\" +\"${coffeeDetails.creamAmount}\"")
    }

//    println("Buy beans")
//    println("Grind Beans")
//    println("Heat water to 90degree")
//    println("Add water")
//    println("Push hot water through the grinded beans")
}*/