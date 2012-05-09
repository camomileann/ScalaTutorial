package com.home.scala.tutorial

/**
 * DATE: Anna Ivashchuk
 * USER: 04.04.12
 */

object Looping {
  def main(args: Array[String]) {
    args.foreach(arg => println(arg))

    println("--------------------")

    for(arg <- args){
      println(arg)
    }
  }

}
