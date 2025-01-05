public class Bank_Account {
    // declaring class variables
    int id_no;
    String name;
    float amount;

    // Creating method "insert" to initialize (assign the value)
    void insert(int id, String n, float amt) {
        id_no = id;
        name = n;
        amount = amt;
    }

    // Creating the method for displaying the information
    void display_info() {
        System.out.println("Name is " + name + " Id no is " + id_no + " amount is " + amount);
    }

    // method to Deposit the amount
    void deposit(int dep_amt) {
        amount = amount + dep_amt;
        System.out.println("The amount after deposit is " + amount);
    }

    //method to withdraw the amount
    void withdraw(int with_amt) {
        if (amount < with_amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - with_amt;
            System.out.println("The amount after withdrawal is " + amount);
        }
    }

    //method to check balance
    void check_bal() {
        System.out.println("Balance of the account holder " + name + "is " + amount);
    }
}

class Test_Account {
    public static void main (String[] Args){
        Bank_Account a1 = new Bank_Account(), a2 = new Bank_Account();
        a1.insert(101,"Sudhar",200000);
        a2.insert(102,"Veera",300000);
        a1.display_info();
        a2.display_info();
        a1.deposit(10000);
        a2.deposit(20000);
        a1.check_bal();
        a2.check_bal();
        a1.withdraw(25000);
        a2.withdraw(75000);
        a1.check_bal();
        a2.check_bal();

    }
}
