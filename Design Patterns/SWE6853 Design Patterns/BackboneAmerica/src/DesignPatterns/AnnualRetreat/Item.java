package DesignPatterns.AnnualRetreat;

import java.util.ArrayList;

 public interface Item {
     String name();
     String description();
     Planner planner();
     int price();
     int sessions();
     // ArrayList addons = new ArrayList();
 }