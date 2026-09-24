// Task 2 
public class account{
    double balance;

    account (){
        balance = 0;
    }
    account (double balanc){
        this.balance=balanc;

    }
    double deposit(double bal1){
        balance =balance +bal1;
        return balance;

    }
    double withdraw (double bal2){
        if (bal2<=balance) {
            balance = balance - bal2;
            return balance;
        }
        else {
            System.out.println("Insufficient balance");
            return balance;
        }
    }

    void display (double amount){
         System .out .println ("Your current balance is :"+amount);
    }

    public static void main (String []args){
        account b1 = new account ();
        account b2 = new account (10000.00);
        b2.deposit (3000);
        b2.display (b2.balance);
        b2.withdraw(5000);
        b2.display (b2.balance);


    }
}