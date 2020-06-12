package com.oop;

public interface ISubject {
  void add(IObserver ob);
  void remove(IObserver ob);
  void notifyAllObservers();
}
