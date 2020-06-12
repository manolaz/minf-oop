package com.oop;

public class Main {
  public static void main(String[] args) {

    Logger logger = new Logger();

    AccountService acc1 = new AccountService("nndkhoa@g.c", "127.0.0.1");
    acc1.add(logger);
    acc1.add(new IObserver() {
      @Override
      public void update(Account data) {
        if (data.getStatus() == AccountStatus.EXPIRED)
          System.out.format("An email has been sent to %s", data.getEmail());
      }
    });
    acc1.add(data -> {
      if (data.getStatus() == AccountStatus.INVALID_IP)
        System.out.format("IP %s has been blocked", data.getIp());
    });

    acc1.login();
    acc1.changeStatus(AccountStatus.EXPIRED);
  }
}
