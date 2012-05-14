package com.home.scala.tutorial

/**
 * @author Anna Ivashchuk
 * @version 1.0
 * @since 14/05/2012
 */
class ChecksumAccumulator {
  private var sum = 0


  def add(b: Byte) = {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator {
  private var cache = Map[String, Int]()

  def calculate(s: String): Int = {
    if(cache.contains(s)) {
      cache(s)
    } else {
      val acc = new ChecksumAccumulator
      for(c <- s) {
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}
