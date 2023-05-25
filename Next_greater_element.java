import java.util.Stack;

public class Next_greater_element {
    public static void nextGreaterElement(int[] arr,int[] nextGreater){
        Stack<Integer> s =new Stack<>();
        s.push(arr.length-1);
        for(int i=arr.length-1;i>=0;i--){
            int currElem = arr[i];
            while(!s.isEmpty() && arr[s.peek()] <= currElem){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }
            else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater=new int[arr.length];
        nextGreaterElement(arr, nextGreater);
        for(int i=0;i<arr.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
    }
}
