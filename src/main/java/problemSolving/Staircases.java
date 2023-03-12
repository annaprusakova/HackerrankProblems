package problemSolving;

import java.io.*;


public class Staircases {
  /*
   * Task: Its base and height are both equal to.
   * It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
   * Write a program that prints a staircase of size .
   */

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    staircase(n);

    bufferedReader.close();
  }

  public static void staircase(int n) {
    for (int spaces = n - 1; spaces >= 0; spaces--) {
      for (int i = 0; i < spaces; i++) {
        System.out.print(" ");
      }
      for (int j = spaces; j < n; j++) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
