package Questions;


import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int value) {
        val = value;
        next = null;
        random = null;
    }
}

public class Clone_LL_With_Random_Ptrs {


    /**
     * This code unable to clear all the test cases of GFG
     * But able to Clear All the Leetcode Test Cases
     */
    Node copyRandomList(Node head) {
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node temp = head;

        //first iteration for inserting deep nodes of every node in the hashmap.
        while (temp != null) {
            Node newNode = new Node(temp.val);
            hashMap.put(temp, newNode);
            temp = temp.next;
        }
        Node t = head;
        //second iteration for linking next and random pointer as given question.
        while (t != null) {
            Node node = hashMap.get(t);
            node.next = (t.next != null) ? hashMap.get(t.next) : null;
            node.random = (t.random != null) ? hashMap.get(t.random) : null;
            t = t.next;
        }
        return hashMap.get(head);


    }


    /**
     * This code unable to clear all the test cases of LeetCode
     * But able to Clear All the GFG Test Cases
     */
    private Node copyList(Node head) {
        Node newHead = null;
        Node prev = null;
        Node newNode = null;

        Node temp = head;

        HashMap<Node, Node> map = new HashMap<>();

        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        while (head != null) {
            newNode.next = map.get(head.next);

            //Map the New Nodes
            if (head.next != null) newNode.next = map.get(head.next);

            if (head.random != null) newNode.random = map.get(head.random);

            if (newHead == null) newHead = newNode;

            else prev.next = newNode;

            prev = newNode;
            head = head.next;
        }

        return newHead;

    }

    /**
     * This is Approach which use SC - O(1) and TC - O(N)
     */

    public Node copyRandomLists(Node head) {
        Node curr = head;
        //Inserting New Node in between
        while (curr != null) {
            Node temp = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = temp;
            curr = temp;
        }

        curr = head;

        //Set the Random pointers of Nodes

        while (curr != null) {
            if (curr.next != null) {
                curr.next.random = (curr.random != null) ? curr.random.next : null;
            }
            curr = curr.next.next;
        }

        Node orig = head;
        Node copy = (head != null) ? head.next : null;
        Node temp = copy;

        //Seprate both of LL

        while (orig != null) {
            orig.next = orig.next.next;
            copy.next = (copy.next != null) ? copy.next.next : copy.next;
            orig = orig.next;
            copy = copy.next;
        }

        return temp;

    }
}


