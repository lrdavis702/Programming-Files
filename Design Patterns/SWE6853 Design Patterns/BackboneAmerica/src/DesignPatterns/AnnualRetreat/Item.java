//This interface includes the variables for items in retreat package
package DesignPatterns.AnnualRetreat;

 public interface Item {
     String name();
     String description();
     Planner planner();
     int price();
     int sessions();
 }