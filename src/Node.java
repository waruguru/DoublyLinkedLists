

public class Node {
    private int data;
    private Node nextNode;
    private Node previousNode;

    /**
     * constructor
     *
     */

    public Node(int data){
        this.data = data;
    }

    public int getData(){
        return this.data;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }
    public void setPreviousNode(Node previousNode){
        this.previousNode = previousNode;
    }

    @Override
    public String toString(){
        return "Data: " + this.data;
    }



}
