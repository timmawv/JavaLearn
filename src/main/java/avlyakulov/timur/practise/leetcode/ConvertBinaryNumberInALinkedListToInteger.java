package avlyakulov.timur.practise.leetcode;

import java.util.Stack;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        String res = String.valueOf(head.val);
        Stack<ListNode> stack = new Stack<>();
        if (head.next != null) {
            stack.push(head.next);
            while (!stack.isEmpty()) {
                ListNode node = stack.pop();
                res = res.concat(String.valueOf(node.val));
                if (node.next != null)
                    stack.push(node.next);
            }
        } else return Integer.parseInt(res, 2);
        return Integer.parseInt(res, 2);
    }

    public ListNode middleNode(ListNode head) {
        return null;
    }


    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();
        ListNode listNode = new ListNode(12);
        ListNode listNode2 = new ListNode(14, listNode);
        System.out.println(listNode2);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}