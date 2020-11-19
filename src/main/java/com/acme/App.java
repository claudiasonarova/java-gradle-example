package com.acme;

public class App {

  public static void main(String[] args) {
    App app = new App();
    System.out.println(app.getGreeting());
    System.out.println(app.getStatement());
  }

  public String getGreeting() {
    return "Hello world.";
  }

  public String getStatement() {
    return "The weather is fine.";
  }
}
