public class TestTime 
{
  public static void main(String[] args) 
  {
    // Init t1 and t2 with zero values
    Time t1 = new Time(0, 0, 0);
    Time t2 = new Time(0, 0, 0);

    // Update t1 to 21:10:15
    t1.setHour(21);
    t1.setMinute(10);
    t1.setSecond(15);

    // Update t2 to 10:20:25
    t2.setHour(10);
    t2.setMinute(20);
    t2.setSecond(25);

    // Print t1 and t2
    System.out.println("Time 1: " + t1);
    System.out.println("Time 2: " + t2);

    // Run nextSecond() on t1
    // Run previousSecond() on t2
    System.out.println("Running nextSecond() on t1 and previousSecond() on t2");
    t1.nextSecond();
    t2.previousSecond();

    // Print t1 and t2
    System.out.println("Time 1: " + t1);
    System.out.println("Time 2: " + t2);

  }  
}
