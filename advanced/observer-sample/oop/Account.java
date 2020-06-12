package com.oop;

enum AccountStatus {
  SUCCESS, FAILURE, EXPIRED, INVALID_IP
}

public class Account {
  private String email;
  private String ip;
  private AccountStatus status;

  public Account(String email, String ip) {
    this.email = email;
    this.ip = ip;
  }

  public String getEmail() {
    return email;
  }

  public String getIp() {
    return ip;
  }

  public AccountStatus getStatus() {
    return status;
  }

  public void setStatus(AccountStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Account{" +
            "email='" + email + '\'' +
            ", ip='" + ip + '\'' +
            ", status=" + status +
            '}';
  }
}
