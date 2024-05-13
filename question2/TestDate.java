public class TestDate 
{
  public static void main(String[] args) 
  {
    // Created 3 dates with different leading zeros
    Date date1 = new Date(5, 10, 2024);
    Date date2 = new Date(10, 5, 2020);
    Date date3 = new Date(1, 1, 834);

    // Used toString to display the date
    System.out.println("Date1: " + date1);
    System.out.println("Date2: " + date2);
    System.out.println("Date3: " + date3);

  }
  
}
