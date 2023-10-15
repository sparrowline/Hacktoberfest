// Java program to check whether a Stack collection 
// is empty or not

import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Stack cars = new Stack();
    Stack stk = new Stack();

    cars.push("Maruti");
    cars.push("Tata");
    cars.push("Hundai");
    cars.push("Honda");

    if (cars.empty())
      System.out.println("Stack car is empty.");
    else
      System.out.println("Stack car is not empty.");

    if (stk.empty())
      System.out.println("Stack stk is empty.");
    else
      System.out.println("Stack stk is not empty.");
  }
}
