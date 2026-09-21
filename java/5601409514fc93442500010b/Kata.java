// Problem title: How good are you really?

public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
	  float sum = 0, average;

	  for (int point : classPoints) {
		  sum += point;
	  }

	  average = sum / classPoints.length;
	  return (yourPoints > average);
  }

  public static void main (String[] args) {
    int[] list = {2, 3};
	  boolean result = betterThanAverage(list, 5);
    System.out.println(Boolean.toString(result));
  }
}
