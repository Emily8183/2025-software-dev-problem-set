class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;

        //step1: copy the nodes' value only
        while (cur != null) {
            map.put(cur, new Node(cur.val, null, null));
            cur = cur.next;
        }

        //step2: add on the next pointer and random pointer
        cur = head;

        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);

            cur = cur.next;
        }

        return map.get(head); //注意返回值
        
    }
}
