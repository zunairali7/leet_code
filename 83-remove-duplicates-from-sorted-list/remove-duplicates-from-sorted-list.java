class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    // Mimic LeetCode's deserialize method
    public static ListNode deserialize(String s) {
        s = s.trim();
        if (s.equals("[]") || s.length() <= 2) return null;

        s = s.substring(1, s.length() - 1); // remove brackets
        String[] parts = s.split(",");
        ListNode head = new ListNode(Integer.parseInt(parts[0].trim()));
        ListNode current = head;
        for (int i = 1; i < parts.length; i++) {
            current.next = new ListNode(Integer.parseInt(parts[i].trim()));
            current = current.next;
        }
        return head;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

public class Main {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = ListNode.deserialize("[1,1,2]");
        head1 = solution.deleteDuplicates(head1);
        printList(head1); // Output: 1 -> 2

        ListNode head2 = ListNode.deserialize("[1,1,2,3,3]");
        head2 = solution.deleteDuplicates(head2);
        printList(head2); // Output: 1 -> 2 -> 3
    }
}