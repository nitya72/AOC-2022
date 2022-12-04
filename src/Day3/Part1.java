package Day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 300; i++) {
            String st = sc.nextLine();
            int length = st.length();
            String part1 = st.substring(0, length / 2);
            String part2 = st.substring(length / 2);
            Set<Character> set = new HashSet<>();
            int[] hash = new int[53];

            for (int j = 0; j < part1.length(); j++) {
                char ch = part1.charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    hash[ch - 'a']++;
                } else {
                    hash[ch - 'A' + 26]++;
                }
            }

            for (int j = 0; j < part2.length(); j++) {
                char ch = part2.charAt(j);
                if (ch >= 'a' && ch <= 'z') {
                    if (hash[ch - 'a'] > 0 && !set.contains(ch)) {
                        set.add(ch);
                        sum += ch - 'a' + 1;
                    }
                } else {
                    if (hash[ch - 'A' + 26] > 0 && !set.contains(ch)) {
                        set.add(ch);
                        sum += ch - 'A' + 27;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
