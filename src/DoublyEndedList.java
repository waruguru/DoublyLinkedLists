public class DoublyEndedList {
    private Node head;
    private Node tail;

    /**
     * Insert data at the tail
     * @param data
     */
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.tail = newNode;
            this.head = newNode; // Update tail if the list was empty

        }else {
            newNode.setPreviousNode(this.tail);
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;

        while (current != null) {
            result += current.toString();
            current = current.getNextNode();
            if (current != null) {
                result += ", ";
            }

        }
        result += "}";
        return result;

    }
}
