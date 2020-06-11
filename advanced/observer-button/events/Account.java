package observer-button.events;

enum AccountStatus{
    SUCCESS, FAILURE, EXPIRED, INVALID_ID;
}

public void setStatus(AccountStatus state) {
    
}

public class Account {
    String email;
    String ip;
    AccountStatus status;

}