import java.util.*;
import java.lang.*;

class Day1 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long sum = 0;
        for (int i = 0; i < 2235; i++) {
            String st = sc.nextLine();
            if (st.length() > 0) {
                int value = Integer.parseInt(st);
                sum += value;
            } else {
                list.add(sum);
                sum = 0;
            }
        }
        list.add(sum);
        Collections.sort(list);
        int size = list.size();
        long res = list.get(size - 1) + list.get(size - 2) + list.get(size - 3);
        System.out.println(res);
    }
}
