import java.util.*;
public class reverse_string {
    public static String reverse(String str){
        if(str.length() == 0){
            return null;
        }
        Stack<Character> s= new Stack<>();
        int idx= 0;
        while(idx < str.length()){
            char curr = str.charAt(idx);
            s.push(curr);
            idx++;
        }
        String newstr="";
        while(!s.isEmpty()){
            newstr+=s.pop();
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(reverse(str));
    }
}
