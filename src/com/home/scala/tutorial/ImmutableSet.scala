package com.home.scala.tutorial

object ImmutableSet {

  def main(args: Array[String]) {
    var fruitSet = Set("Orange", "Peach")
    fruitSet += "Kiwi"
    println(fruitSet.contains("Cucumber"))
  }
}
