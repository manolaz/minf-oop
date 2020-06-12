import observer.AccountService;
import observer.AccountStatus.Account;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Logger log = new Logger();
        AccountService acc = new AccountService("me@manolaz.co", "127.2.2.3");
        acc.add(log);
        acc.add(new IObserver(){
            @Override
            public void update(Account data) {
                // TODO Auto-generated method stub
                
            }
        })
    }
}