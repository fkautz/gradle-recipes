package com.example.math

import org.apache.commons.math3.random.{Well44497b => RandomGenerator}

object MyMath {
  val generator = new RandomGenerator()
  def nextInt() = {
    generator.nextInt()
  }
}
