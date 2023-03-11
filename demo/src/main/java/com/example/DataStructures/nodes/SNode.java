// This class defines the Node DataStructure
public class SingularNode {
    public int data;
    public SNode next = null

    public SNode(int data) {
        this.data = data;
    }
    public void print() {
        System.out.println("Data: " + data);
        if (next != null) {
            System.out.println("Next: " + next.data);
        }
        System.out.println("------------------------------");
    }
}
