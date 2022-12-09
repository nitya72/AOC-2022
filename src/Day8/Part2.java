package Day8;

import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 99;

        String[] arr = new String[size];

        for(int i=0;i<size;i++) {
            String st = sc.next();
            arr[i] = st;
        }

        int[][] grid = new int[size][arr[0].length()];

        for(int i=0;i<size;i++) {
            String st = arr[i];
            for (int j=0;j<arr[i].length();j++) {
                grid[i][j] = Integer.parseInt(st.charAt(j)+"");
            }
        }

        int result = Integer.MIN_VALUE;
        for(int i=1;i<grid.length-1;i++) {
            for (int k = 1;k<grid[0].length-1;k++) {

                //left
                int in = 0;
                int score = 1;
                for(int j=k-1;j>=0;j--) {
                    in++;
                    if (grid[i][k] <= grid[i][j]) {
                        break;
                    }
                }
                score *= in;

                //right
                in = 0;
                for(int j=k+1;j< grid[0].length;j++) {
                    in++;
                    if (grid[i][k] <= grid[i][j]) {
                        break;
                    }
                }
                score *= in;

                //top
                in = 0;
                for(int j=i-1;j>=0;j--) {
                    in++;
                    if (grid[i][k] <= grid[j][k]) {
                        break;
                    }
                }
                score *= in;

                //bottom
                in = 0;
                for(int j=i+1;j< grid.length;j++) {
                    in++;
                    if (grid[i][k] <= grid[j][k]) {
                        break;
                    }
                }
                score *= in;

                result = Math.max(result, score);
            }
        }
        System.out.println(result);
    }
}
