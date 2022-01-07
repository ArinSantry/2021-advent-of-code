// How many measurements are larger than the previous measurement?

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Day1
{
    public static void main(String[] args) {
        int prev = 9999;
        int curr;
        int lineNum = 0;
        int numIncrease = 0;
        String lineString;
        int lineInt;
        try {
          File infile = new File("inputDay1.txt");
          Scanner myReader = new Scanner(infile);
          while (myReader.hasNextLine()) {
            lineNum++;
            lineString = myReader.nextLine();
            lineInt = Integer.parseInt(lineString);
            curr = lineInt;
            if(lineNum > 1)
            {
                if(isLarger(prev, curr))
                {
                    numIncrease++;
                }
            }
            prev = lineInt;
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
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