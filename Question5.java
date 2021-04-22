import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;


public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    int highest_count = 0;
    int mode = 0;
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    ArrayList<Integer> data = new ArrayList<>();
    for (int i = 0; i < number; i++){
      int datanum = in.nextInt();
      data.add(datanum);
    }

    for (int x = 0; x<number; x++){
        int current_count = 0;
        int current_number = data.get(x);
        for (int y = 0; y<number; y++){
          if (current_number == data.get(y)){
            current_count++;
          }
        }
        if(current_count > highest_count){
          highest_count = current_count;
          mode = current_number;
        }
    }
    
    System.out.println(mode);

  }
}
