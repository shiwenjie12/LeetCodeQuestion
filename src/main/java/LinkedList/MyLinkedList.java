class MyLinkedList {

    Node head;
    int length;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        length = 0;
        head = new Node(-1);
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= length || index < 0)
            return -1;
        Node current = head;
        for(int i = 0; i <= index; i++)
            current = current.next;
        return current.value;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node temp = new Node(val);
        temp.next = head.next;
        head.next = temp;
        length ++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node current = head;
        while(current.next != null)
            current = current.next;
        Node temp = new Node(val);
        current.next = temp;
        length ++;
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > length)
            return;
        if(index == length){
            addAtTail(val);
            return;
        }
        if(index < 0)
            index = index+length+1;
        Node current = head;
        for(int i = 0; i < index; i++)
            current = current.next;
        Node ptr = current.next;
        Node temp = new Node(val);
        current.next = temp;
        temp.next = ptr;
        length ++;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= length || index < 0)
            return;
        Node current = head;
        for(int i = 0; i < index; i++)
            current = current.next;
        current.next = current.next.next;
        length --;
    }

    public void print(){
        Node current = head;
        StringBuilder builder = new StringBuilder();
        while(current != null){
            builder.append(String.valueOf(current.value) + " ");
            current = current.next;
        }
        System.out.println(builder);
    }
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
    }
}