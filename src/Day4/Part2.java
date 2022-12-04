package Day4;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 1000; i++) {
            String st = sc.nextLine();
            String[] pairs = st.split(",");
            String[] pair1 = pairs[0].split("-");
            String[] pair2 = pairs[1].split("-");
            int p1 = Integer.parseInt(pair1[0]);
            int p2 = Integer.parseInt(pair1[1]);
            int p3 = Integer.parseInt(pair2[0]);
            int p4 = Integer.parseInt(pair2[1]);
            int max = Math.max(p2, p4);
            int[] hash1 = new int[max + 1];
            for (int j = p1; j <= p2; j++) {
                hash1[j]++;
            }

            for (int j = p3; j <= p4; j++) {
                if (hash1[j] > 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
