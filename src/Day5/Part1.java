package Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Stack> listStack = new ArrayList<>();
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();
        Stack<String> stack4 = new Stack<>();
        Stack<String> stack5 = new Stack<>();
        Stack<String> stack6 = new Stack<>();
        Stack<String> stack7 = new Stack<>();
        Stack<String> stack8 = new Stack<>();
        Stack<String> stack9 = new Stack<>();

        stack1.push("H");
        stack1.push("C");
        stack1.push("R");

        stack2.push("B");
        stack2.push("J");
        stack2.push("H");
        stack2.push("L");
        stack2.push("S");
        stack2.push("F");

        stack3.push("R");
        stack3.push("M");
        stack3.push("D");
        stack3.push("H");
        stack3.push("J");
        stack3.push("T");
        stack3.push("Q");

        stack4.push("S");
        stack4.push("G");
        stack4.push("R");
        stack4.push("H");
        stack4.push("Z");
        stack4.push("B");
        stack4.push("J");

        stack5.push("R");
        stack5.push("P");
        stack5.push("F");
        stack5.push("Z");
        stack5.push("T");
        stack5.push("D");
        stack5.push("C");
        stack5.push("B");

        stack6.push("T");
        stack6.push("H");
        stack6.push("C");
        stack6.push("G");

        stack7.push("S");
        stack7.push("N");
        stack7.push("V");
        stack7.push("Z");
        stack7.push("B");
        stack7.push("P");
        stack7.push("W");
        stack7.push("L");

        stack8.push("R");
        stack8.push("J");
        stack8.push("Q");
        stack8.push("G");
        stack8.push("C");

        stack9.push("L");
        stack9.push("D");
        stack9.push("T");
        stack9.push("R");
        stack9.push("H");
        stack9.push("P");
        stack9.push("F");
        stack9.push("S");

        listStack.add(stack1);
        listStack.add(stack2);
        listStack.add(stack3);
        listStack.add(stack4);
        listStack.add(stack5);
        listStack.add(stack6);
        listStack.add(stack7);
        listStack.add(stack8);
        listStack.add(stack9);

        for (int i = 0; i < 503; i++) {
            String st = sc.nextLine();
            String[] part = st.split(" ");
            int count = Integer.parseInt(part[1]);
            int from = Integer.parseInt(part[3]) - 1;
            int to = Integer.parseInt(part[5]) - 1;
            System.out.println(count + " " + from + " " + to);

            List<String> items = new ArrayList<>();
            Stack<String> fromStack = new Stack<>();
            Stack<String> toStack = new Stack<>();
            for (int j = 0; j < count; j++) {
                fromStack = listStack.get(from);
                String value = fromStack.pop();
                items.add(value);
            }

            for (int j = items.size() - 1; j >= 0; j--) {
                toStack = listStack.get(to);
                toStack.push(items.get(j));
            }
            listStack.remove(from);
            listStack.add(from, fromStack);
            listStack.remove(to);
            listStack.add(to, toStack);
            System.out.println(listStack);
        }

        String result = "";
        for (int i = 0; i < listStack.size(); i++) {
            Stack stack = listStack.get(i);
            result += stack.pop();
        }
        System.out.println(result);
    }
}
