package com.example.kotlinbasics

fun main(){
    var computerChice = ""
    var playerChoice = ""

    println("Rock, Paper or Scissors? Enter your choice!")
    playerChoice = readln().toString()

    val randomNumner = (1..3).random()

    when (randomNumner) {
        1 -> {
            computerChice = "Rock"
        }
        2 -> {
            computerChice = "Paper"
        }
        3 -> {
            computerChice = "Scissors"
        }
    }
    println("ComputerChoice $computerChice")

    val winner = when {
        playerChoice == computerChice -> "Tie"
        playerChoice == "Rock" && computerChice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChice == "Paper" -> "Player"
        else -> "Computer"
    }

    if(winner == "Tie") {
        println("It's a tie")
    }else{
        println("$winner won!")
    }

}