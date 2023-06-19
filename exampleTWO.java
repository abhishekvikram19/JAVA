
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class exampleTWO {
    public static void main(String[] args){

        Queue<Integer> q=new LinkedList<Integer>();
        Stack<Integer> s=new Stack<Integer>();
        q.add(5);
        q.add(10);
        s.push(10);
        s.push(20);
        System.out.print(q.peek()+s.pop());

  /*      Stack<Integer> stack = new Stack<Integer>();

        while(stack.isEmpty())
        {
            stack.push(10);
        }
        System.out.print(stack.pop()+" "+stack.size());*/

       /* System.out.println(stack.push(5));
        System.out.println(stack.push(4));
        System.out.println(stack.size());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.push(6));
        System.out.println(stack.pop());
        stack.push(2);)
        stack.push(3);
        stack.size();
        stack.pop();
        stack.push(8);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());*/

    }

}
