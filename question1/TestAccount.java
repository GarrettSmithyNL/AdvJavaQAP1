public class TestAccount 
{
  public static void main(String[] args) 
  {
    // Creates 2 accounts
    Account Acc1 = new Account("12W1245", "John Doe", 5000);
    Account Acc2 = new Account("53G5167", "Jane Doe", 4000);

    // Prints the account balances
    System.out.println(Acc1.getName() + " has $" + Acc1.getBalance());
    System.out.println(Acc2.getName() + " has $" + Acc2.getBalance());

    // Transfers $1000 to Acc1 to Acc2
    Acc1.transferTo(Acc2, 1000);
    System.out.println("Transfering $1000 between accounts");

    // Prints out the updated balances
    System.out.println(Acc1.getName() + " has $" + Acc1.getBalance());
    System.out.println(Acc2.getName() + " has $" + Acc2.getBalance());
  }
  
}
