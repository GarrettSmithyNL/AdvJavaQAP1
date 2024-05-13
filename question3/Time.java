/**
 * The Time class represents a time value in hours, minutes, and seconds.
 */
public class Time 
{
  private int hour;
  private int minute;
  private int second;

  /**
   * Constructs a Time object with the specified hour, minute, and second.
   * 
   * @param hour the hour value
   * @param minute the minute value
   * @param second the second value
   */
  public Time(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
   * Returns the hour value of this Time object.
   * 
   * @return the hour value
   */
  public int getHour() {  return this.hour; }

  /**
   * Returns the minute value of this Time object.
   * 
   * @return the minute value
   */
  public int getMinute() {  return this.minute; }

  /**
   * Returns the second value of this Time object.
   * 
   * @return the second value
   */
  public int getSecond() {  return this.second; }
  
  /**
   * Sets the hour value of this Time object.
   * 
   * @param hour the new hour value
   */
  public void setHour(int hour) { this.hour = hour; }

  /**
   * Sets the minute value of this Time object.
   * 
   * @param minute the new minute value
   */
  public void setMinute(int minute) { this.minute = minute; }

  /**
   * Sets the second value of this Time object.
   * 
   * @param second the new second value
   */
  public void setSecond(int second) { this.second = second; }

  /**
   * Sets the time value of this Time object.
   * 
   * @param hour the new hour value
   * @param minute the new minute value
   * @param second the new second value
   */
  public void setTime(int hour, int minute, int second)
  {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /**
   * Returns a string representation of this Time object in the format "HH:MM:SS".
   * 
   * @return a string representation of this Time object
   */
  public String toString() 
  {
    String fHour = String.format("%02d", this.hour);
    String fMinute = String.format("%02d", this.minute);
    String fSecond = String.format("%02d", this.second);

    return fHour + ":" + fMinute + ":" + fSecond;
  }

  /**
   * Advances the time value of this Time object by one second.
   * 
   * @return the updated Time object
   */
  public Time nextSecond()
  {
    this.second++;
    if (this.second > 59)
    {
      this.minute++;
      this.second = 0;
    }
    if (this.minute > 59)
    {
      this.hour++;
      this.minute = 0;
    }
    return this;
  }

  /**
   * Decreases the time value of this Time object by one second.
   * 
   * @return the updated Time object
   */
  public Time previousSecond()
  {
    this.second--;
    if (this.second < 0)
    {
      this.minute--;
      this.second = 59;
    }
    if (this.minute < 0)
    {
      this.hour--;
      this.minute = 59;
    }
    return this;
  }
}
