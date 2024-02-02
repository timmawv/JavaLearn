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
        int length = countNumberOfElementsInListNode(head);

        ListNode middleNode = new ListNode(10, head);
        return middleNode;
    }

    private int countNumberOfElementsInListNode(ListNode listNode) {
        int counter; //просчитать количество элементов в linked list
        if (listNode != null)
            counter = 1;
        else
            return 0;


        if (listNode.next != null) {
            ++counter;
            counter += countNumberOfElementsInListNode(listNode.next);
        }

        return counter;
    }


    public static void main(String[] args) {
        ConvertBinaryNumberInALinkedListToInteger convertBinaryNumberInALinkedListToInteger = new ConvertBinaryNumberInALinkedListToInteger();
        ListNode listNode = new ListNode(12);
        ListNode listNode1 = new ListNode(13, listNode);
        ListNode listNode2 = new ListNode(14, listNode1);
        ListNode listNode3 = convertBinaryNumberInALinkedListToInteger.middleNode(listNode2);
        System.out.println(listNode3);

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

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ",\n next=" + next +
                '}';
    }
}