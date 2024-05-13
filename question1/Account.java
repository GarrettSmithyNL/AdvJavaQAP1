/**
 * The Account class represents a bank account.
 * It stores the account's id, name, and balance,
 * and provides methods to perform various operations on the account.
 * By: Garrett Smith
 * Date: May 10, 2024
 */
public class Account
{
  
  private String id;
  private String name;
  private int balance = 0;

  /**
   * Constructs an Account object with the specified id and name.
   * 
   * @param id   the id of the account
   * @param name the name of the account holder
   */
  public Account(String id, String name)
  {
    this.id = id;
    this.name = name;
  }

  /**
   * Constructs an Account object with the specified id, name, and balance.
   * 
   * @param id      the id of the account
   * @param name    the name of the account holder
   * @param balance the initial balance of the account
   */
  public Account(String id, String name, int balance)
  {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  /**
   * Returns the id of the account.
   * 
   * @return the id of the account
   */
  public String getID() { return this.id; }

  /**
   * Returns the name of the account holder.
   * 
   * @return the name of the account holder
   */
  public String getName() { return this.name; }

  /**
   * Returns the balance of the account.
   * 
   * @return the balance of the account
   */
  public int getBalance()  {  return this.balance;  }
  
  /**
   * Adds the specified amount to the account balance.
   * 
   * @param amount the amount to be credited to the account
   * @return the updated account balance after the credit
   */
  public int credit(int amount)
  {
    this.balance += amount;
    return this.balance;
  }

  /**
   * Decreases the balance of the account by the specified amount.
   * 
   * @param amount the amount to be debited from the account
   * @return the updated balance after the debit operation
   */
  public int debit(int amount)
  {
    if (amount <= balance)
    {
      this.balance -= amount;
    }
    else
    {
      System.out.println("Amount exceeded balance");
    }
    
    return this.balance;
  }

  /**
   * Transfers the specified amount from this account to another account.
   * 
   * @param another the account to transfer the amount to
   * @param amount the amount to transfer
   * @return the balance of this account after the transfer
   */
  public int transferTo(Account another, int amount)
  {
    if (amount <= balance)
    {
      another.balance += amount;
      this.balance -= amount;
    }
    else
    {
      System.out.println("Amount exceeded balance");
    }

    return this.balance;
  }

  /**
   * Returns a string representation of the Account object.
   * The string contains the account's id, name, and balance.
   *
   * @return a string representation of the Account object
   */
  public String toString()
  {
    return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
  }
}