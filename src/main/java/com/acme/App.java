package com.acme;

// App
public class App {

  // main
  public static void main(String[] args) {
    App app = new App();
    System.out.println(app.getGreeting());
    System.out.println(app.getStatement());
  }

  // getGreeting
  public String getGreeting() {
    return "Hello world.";
  }

  // getStatement
  public String getStatement() {
    return "The weather is lovely.";
  }
}
