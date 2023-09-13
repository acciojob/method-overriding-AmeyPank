package com.driver;

public class Main {
  public static void main(String[] args) {
    // Task 3: Create an object of class B
    B obj = new B();
    // Task 5: Call the overridden method from the object of class B
    System.out.println(obj.meth());
  }
}

// Task 1: Create a class A with a method named meth
class A {
  String meth() {
    return "Invoking method from class A";
  }
}

// Task 2: Create a class B which extends class A
class B extends A {
  // Task 4: Override the method meth in class B
  @Override
  String meth() {
    return "Method is overridden in Extended class B";
  }
}