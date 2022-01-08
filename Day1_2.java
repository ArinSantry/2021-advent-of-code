// 697 - too low

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Day1_2 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int nums[] = new int[2000];
        int sums[] = new int[2000];
        int lineNum = 0;
        int numIncrease = 0;
        String lineString;
        int lineInt;
        try {
          File infile = new File("inputDay1.txt");
          Scanner myReader = new Scanner(infile);
          while (myReader.hasNextLine()) {
            lineString = myReader.nextLine();
            lineInt = Integer.parseInt(lineString);

            nums[lineNum] = lineInt;
            lineNum++;
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }

        for (int i = 0; i < nums.length - 2; i++)
        {
            sums[i] = nums[i] + nums[i+1] + nums[i+2];
        }

        for (int i = 0; i < sums.length - 1; i++)
        {
            sum1 = sums[i];
            sum2 = sums[i+1];
            if(isLarger(sum1, sum2))
            {
                numIncrease++;
            }
        }

        System.out.println(numIncrease);
      }

      private static boolean isLarger(int prev, int curr)
      {
            if(prev < curr)
                return true;
            else
                return false;
      }
}
