import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class KataBrackets {
    public static void main(String[] args) {
        System.out.println(validBrackets(")("));

    }


    private static boolean validBrackets(String input) {
        Map<Character,Character> brackets =new HashMap<>();
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');
        Deque <Character> stack = new LinkedList<>();
        for (char a: input.toCharArray()){
            if (brackets.containsValue(a)){
                stack.push(a);
            }
            else if (brackets.containsKey(a)){
                if (stack.isEmpty()|| stack.pop() != brackets.get(a)){
                    return  false;
                }
            }
        }
        return stack.isEmpty();
    }
}