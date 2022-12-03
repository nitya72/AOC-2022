import java.util.*;
import java.lang.*;

class Day2
{
    // A for Rock, B for Paper, and C for Scissors
    // X means you need to lose, Y means you need to end the round in a draw,
    // and Z means you need to win
    // (1 for Rock, 2 for Paper, and 3 for Scissors)
    // (0 if you lost, 3 if the round was a draw, and 6 if you won).
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=0;i<2500;i++) {
            String st = sc.nextLine();
            String[] arr = st.split(" ");
            String a = arr[0];
            String b = arr[1];
            if(a.equals("A") && b.equals("X")) {
                sum += 3+0;
            } else if(a.equals("A") && b.equals("Y")) {
                sum += 1+3;
            } else if(a.equals("A") && b.equals("Z")) {
                sum += 2+6;
            } else if(a.equals("B") && b.equals("X")) {
                sum += 1+0;
            } else if(a.equals("B") && b.equals("Y")) {
                sum += 2+3;
            } else if(a.equals("B") && b.equals("Z")) {
                sum += 3+6;
            } else if(a.equals("C") && b.equals("X")) {
                sum += 2+0;
            } else if(a.equals("C") && b.equals("Y")) {
                sum += 3+3;
            } else if(a.equals("C") && b.equals("Z")) {
                sum += 1+6;
            }
        }
        System.out.println(sum);
    }
}