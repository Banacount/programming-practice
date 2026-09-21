// status: solved
// title: Determine the date by the day number

public class Kata {
  static String[] months_str = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  static int[] months_int = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public static String getDay(int day, boolean isLeap) {
    int months_total = 0, i = -1, last_month = 0;

    while (day > months_total) {
      i++;
      int month_to_add = months_int[i];

      if (i == 1 && isLeap) month_to_add++;
      months_total += month_to_add;
      last_month = month_to_add;
    }

    months_total -= last_month;

    return months_str[i] + ", " + Integer.toString(Math.abs(months_total - day));
  }

  public static void main (String[] args) {
    System.out.println(getDay(41, false));
  }
}
