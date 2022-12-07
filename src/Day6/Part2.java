package Day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int count = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(st.charAt(0), 0);
        int temp = 0;

        for (int i = 1; i < st.length(); i++) {
            if(!map.containsKey(st.charAt(i))) {
                count++;
                map.put(st.charAt(i), i);
                if (count == 14) {
                    System.out.println(i+1);
                    break;
                }
            } else {
                int value = map.get(st.charAt(i));
                for(int j=temp;j<=value;j++) {
                    map.remove(st.charAt(j));
                }
                temp = value+1;
                map.put(st.charAt(i), i);
                count = map.size();
            }
        }
    }
}
