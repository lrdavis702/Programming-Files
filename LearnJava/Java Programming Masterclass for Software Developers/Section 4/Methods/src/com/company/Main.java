package com.company;

public class Main {

   public static void main(String[] args) {
      boolean isGameOver = true;
      boolean isGameOver2 = true;
      int[] score = {1500, 900, 400, 50};
      String[] player = {"Renee", "Esther", "Corban", "Silena"};
      int levelCompleted = 0;
      int bonus = 0;
      int highScore = 0;
      int[] position = {0, 0, 0, 0};
      int[] finalScore = {0, 0, 0, 0};
   
      for (int count = 0; count < player.length; count++) {
         finalScore[count] = calculateScore(count, score, levelCompleted, bonus, isGameOver, player);
         if (finalScore[count] > highScore) {
            position[count] = calculateHighScorePosition(finalScore, count);
         }
         displayHighScorePosition(player, position, count);
      }
   }

   public static int calculateScore(int count, int[] score, int levelCompleted, int bonus, boolean isGameOver, String[] player) {
   
      if (isGameOver) {
         int finalScore = score[count] + (levelCompleted * bonus);
      //            finalScore += 1;
         System.out.println(player[count] + ", your final score is " + finalScore);
         return finalScore;
      }
      return -1;
   }

   public static void displayHighScorePosition(String[] player, int[] position, int count) {
      System.out.println(player[count] + ", you managed to get into position " + position[count] +
             " on the high score table.");
   }

   public static int calculateHighScorePosition(int[] finalScore, int count) {
   
      int position = 4;
   
      if (finalScore[count] >= 1000) position = 1;
      else if (finalScore[count] >= 500) position = 2;
      else if (finalScore[count] >= 100); position = 3;
   
      return position;
   }
}

