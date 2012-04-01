package com.home.scala.tutorial


object Timer {


  def hello() {
    println("Hello, Anna!!!")
  }

  def oncePerSecond(callback: () => Unit) {
    while (true) {
      callback()
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]) {
    oncePerSecond(hello)
  }

}
