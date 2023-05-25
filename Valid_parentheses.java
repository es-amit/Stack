import java.util.Stack;

public class Valid_parentheses {
    public static boolean check_parentheses(String p){
        Stack<Character> s =new Stack<>();
        for(int i=0;i<p.length();i++){
            char currChar = p.charAt(i);
            if(currChar == '(' || currChar == '['||currChar == '{'){
                s.push(currChar);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top = s.peek();
                if((top == '(' && currChar == ')')||(top == '{' && currChar == '}')||(top == '[' && currChar == ']'))
                {
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        String parentheses = "({{}}())";
        System.out.println(check_parentheses(parentheses));
    }
}
