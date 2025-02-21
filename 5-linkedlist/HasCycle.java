class HasCycle {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        ListNode cursor = head;
        ListNode fastCursor = head;

        while (fastCursor != null && fastCursor.next != null) {
            cursor = cursor.next;
            fastCursor = fastCursor.next.next;

            if (cursor == fastCursor) {
                return true;
            }
        }


        return false;
    }

}
