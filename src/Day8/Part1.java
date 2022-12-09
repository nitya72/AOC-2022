package Day8;

import java.util.Scanner;

public class Part1 {

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

        int visible = grid[0].length + grid.length -1+grid[0].length-1 +grid.length-2;

        for(int i=1;i<grid.length-1;i++) {
            for (int k = 1;k<grid[0].length-1;k++) {
                boolean isVisible = false;

                //left
                int max = Integer.MIN_VALUE;
                for(int j=k-1;j>=0;j--) {
                    max = Math.max(max, grid[i][j]);
                }
                if (grid[i][k] > max) {
                    isVisible = true;
                }
                //right
                max = Integer.MIN_VALUE;
                if (!isVisible) {
                    for(int j=k+1;j< grid[0].length;j++) {
                        max = Math.max(max, grid[i][j]);
                    }
                    if (grid[i][k] > max) {
                        isVisible = true;
                    }
                }

                //top
                max = Integer.MIN_VALUE;
                if (!isVisible) {
                    for(int j=i-1;j>=0;j--) {
                        max = Math.max(max, grid[j][k]);
                    }
                    if (grid[i][k] > max) {
                        isVisible = true;
                    }
                }

                //bottom
                max = Integer.MIN_VALUE;
                if (!isVisible) {
                    for(int j=i+1;j< grid.length;j++) {
                        max = Math.max(max, grid[j][k]);
                    }
                    if (grid[i][k] > max) {
                        isVisible = true;
                    }
                }

                if (isVisible)
                    visible++;
            }
        }
        System.out.println(visible);
    }
}
