package com.oop;

import java.util.ArrayList;

public class AccountService implements ISubject {

  ArrayList<IObserver> observers = new ArrayList<>();
  Account data;

  public AccountService(String email, String ip) {
    this.data = new Account(email, ip);
  }

  public void changeStatus(AccountStatus state) {
    data.setStatus(state);
    System.out.println("Account's status has changed.");

    this.notifyAllObservers();
  }

  public void login() {
    if (!isValidIp()) {
      changeStatus(AccountStatus.INVALID_IP);
    } else if (!isValidEmail()) {
      changeStatus(AccountStatus.FAILURE);
    } else {
      changeStatus(AccountStatus.SUCCESS);
    }
  }

  private boolean isValidIp() {
    return "127.0.0.1".equals(this.data.getIp());
  }

  private boolean isValidEmail() {
    return "nndkhoa@g.c".equals(this.data.getEmail());
  }

  @Override
  public void add(IObserver ob) {
    if (!observers.contains(ob)) {
      observers.add(ob);
    }
  }

  @Override
  public void remove(IObserver ob) {
    observers.remove(ob);
  }

  @Override
  public void notifyAllObservers() {
    for (IObserver ob : this.observers) {
      ob.update(data);
    }
  }
}
