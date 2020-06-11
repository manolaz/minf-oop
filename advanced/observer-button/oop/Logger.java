package com.oop;

public class Logger implements IObserver {

  @Override
  public void update(Account data) {
    System.out.format("Logger: %s\n", data);
  }
}
