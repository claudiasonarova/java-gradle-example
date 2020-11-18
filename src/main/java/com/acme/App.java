package com.acme;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println(new App().getGreeting());
  }

  public String getGreeting() {
    return "Hello world.";
  }
}
