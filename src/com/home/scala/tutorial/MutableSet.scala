package com.home.scala.tutorial

import scala.collection.mutable.Set

object MutableSet {
  def main(args: Array[String]) {
    var furnitureSet = Set("Chair", "Table", "Closet")
    furnitureSet += "Mirror"
    println(furnitureSet)
  }
}
