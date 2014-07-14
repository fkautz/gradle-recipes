package com.example

import org.slf4j.LoggerFactory

object HelloApplication {
  def main(args: Array[String]) {
    val logger = LoggerFactory.getLogger(classOf[HelloApplication])
    logger.info("Hello World")
  }
}

class HelloApplication{}
