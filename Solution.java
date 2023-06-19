class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution
{

    public static void multiply(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2)
    {
        String s = "";
        while(head1.data != -1)
        {
            System.out.print(head1.data);
            head1 = head1.next;
        }
    }

}