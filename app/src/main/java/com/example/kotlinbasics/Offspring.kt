package com.example.kotlinbasics

class Offspring :Secondary(), Archer, Singer {
    override fun achery() {
        super<Archer>.achery()
        println("Archery skills enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skills enhanced by Offspring")
    }



}