package Day4;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i=0; i<1000;i++) {
            String st = sc.nextLine();
            String[] pairs = st.split(",");
            String[] pair1 = pairs[0].split("-");
            String[] pair2 = pairs[1].split("-");
            int p1 = Integer.parseInt(pair1[0]);
            int p2 = Integer.parseInt(pair1[1]);
            int p3 = Integer.parseInt(pair2[0]);
            int p4 = Integer.parseInt(pair2[1]);

            // 2-8 fully contains 3-7
            if((p1 <= p3 && p2 >= p4) || (p3 <= p1 && p4 >= p2))
                count++;
        }
        System.out.println(count);
    }
}

