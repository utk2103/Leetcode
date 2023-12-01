class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carr = 0;

        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            // 计算对应位置上两个数相加之和 + 进位
            int sum = x + y + carr;	
            // 计算进位的值
            carr = sum / 10;
            // 利用链表的 尾插法 插入数据
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carr != 0) {
            curr.next = new ListNode(carr);
        }

        return dummy.next;
    }
}