package com.example.kotlinbasics

// Derived Class of Baseclass
// Inheris from Baseclass
open class Secondary: BaseClass() {

    override fun role() {
//        super.role()
        println("Knight of the House of Baseclass")
    }
}