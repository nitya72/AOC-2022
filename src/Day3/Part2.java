package Day3;

import java.util.*;

public class Part2 {
    // vJrwpWtwJgWrhcsFMMfFFhFp -> 24 -> 12

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i=0;i<100;i++) {
            String s1= sc.nextLine();
            String s2= sc.nextLine();
            String s3= sc.nextLine();

            int[] hash1 = new int[53];
            int[] hash2 = new int[53];

            for(int j=0;j<s1.length();j++) {
                char ch = s1.charAt(j);
                if(ch >= 'a' && ch <= 'z') {
                    hash1[ch-'a']++;
                } else {
                    hash1[ch-'A'+26]++;
                }
            }

            for(int j=0;j<s2.length();j++) {
                char ch = s2.charAt(j);
                if(ch >= 'a' && ch <= 'z') {
                    hash2[ch-'a']++;
                } else {
                    hash2[ch-'A'+26]++;
                }
            }

            for(int j=0;j<s3.length();j++) {
                char ch = s3.charAt(j);
                if(ch >= 'a' && ch <= 'z') {
                    if(hash1[ch-'a'] > 0 && hash2[ch-'a'] > 0) {
                        sum += ch-'a'+1;
                        break;
                    }
                } else {
                    if(hash1[ch-'A'+26] > 0 && hash2[ch-'A'+26] > 0) {
                        sum += ch-'A'+27;
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
