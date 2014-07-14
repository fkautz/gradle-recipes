package com.example.application;

import com.example.recommender.MyRecommender;

public class Application {
  public static void main(String[] args) {
    MyRecommender recommender = new MyRecommender();
    System.out.println(recommender.recommend());
  }
}
