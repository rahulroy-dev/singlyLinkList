package LinkedList;

public class FindMiddle {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 4, 6, 3 };
        Node head = new Node();
        for (int i = 0; i < arr.length; i++) {
            Node.createNode(arr[i], head);
        }
        Node.printNode(head.next);
        System.out.println();
        int count = 0;
        Node temp = head;
        Node mid = head;
        while (temp != null && temp.next!=null) {
            count++;
            // System.out.println(temp.data);
            temp = temp.next.next;
            mid = mid.next;

        }
        System.out.println(count);
        System.out.println(mid.data);
    }
}
