package com.acme;

public class App {

  public static void main(String[] args) {
    app = new App();
    System.out.println(app.getGreeting());
    System.out.println(app.getParting());
  }

  public String getGreeting() {
    return "Hello world.";
  }

  public String getParting() {
    return "Goodbye world.";
  }
}
