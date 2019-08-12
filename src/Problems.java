import java.util.Stack;

public class Problems {

    static int flag = 1;

    public static void problemOne(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    flag = 0;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    flag = 0;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    flag = 0;
                }
            }

        }
        if (flag == 1) {
            System.out.println("Perfectly balanced, as all things should be!");
        } else System.out.println("Snapped, no good.");

    }

    public static int countOccurrances(String subStr, String str, int numberSeeked) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith(subStr)) {
                count++;
            }
        }
       if(count == numberSeeked){
           System.out.println("true");
       }

       else System.out.println("false");

        return count;
    }

    public static void main(String args[]) {
        String name = "Jonathan W";


        System.out.println(name);

        System.out.println("Problem #1: ");

        problemOne("{()}");

        System.out.println("Problem #2: ");

        countOccurrances("hello", "hellohellohello", 3);



    }



}





