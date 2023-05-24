import java.util.*;

public class Push_at_bottom {
    // Push at the bottom of the stack with O(n) time complexity
    public static void pushatBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top  = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushatBottom(s,4);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
