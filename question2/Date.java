/**
 * The Date class represents a date with day, month, and year components.
 * By: Garrett Smith
 * Date: May 10, 2024
 */
public class Date 
{
  private int day;
  private int month;
  private int year;

  /**
   * Constructs a Date object with the specified day, month, and year.
   * 
   * @param day the day component of the date
   * @param month the month component of the date
   * @param year the year component of the date
   */
  public Date(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  /**
   * Returns the day component of the date.
   * 
   * @return the day component of the date
   */
  public int getDay() {  return this.day;  }
  
  /**
   * Returns the month component of the date.
   * 
   * @return the month component of the date
   */
  public int getMonth() {  return this.month;  }
  
  /**
   * Returns the year component of the date.
   * 
   * @return the year component of the date
   */
  public int getYear() { return this.year; }

  /**
   * Sets the day component of the date.
   * 
   * @param day the new day component of the date
   */
  public void setDay(int day) { this.day = day; }
  
  /**
   * Sets the month component of the date.
   * 
   * @param month the new month component of the date
   */
  public void setMonth(int month) { this.month = month; }
  
  /**
   * Sets the year component of the date.
   * 
   * @param year the new year component of the date
   */
  public void setYear(int year) { this.year = year; }

  /**
   * Sets the day, month, and year components of the date.
   * 
   * @param day the new day component of the date
   * @param month the new month component of the date
   * @param year the new year component of the date
   */
  public void setDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  /**
   * Returns a string representation of the date in the format "dd/mm/yyyy".
   * 
   * @return a string representation of the date
   */
  public String toString() 
  {
    String fDay = String.format("%02d", this.day);
    String fMonth = String.format("%02d", this.month);
    String fYear = String.format("%04d", this.year);

    return fDay + "/" + fMonth + "/" + fYear;
  }
}
