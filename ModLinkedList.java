import java.util.Random;

//my implementation of Linked List
public class ModLinkedList {
    Node root;

    //Node class
    static class Node{
        Node next;
        int data;

        Node (int d){ data = d;}
    }

    //generates random Linked List with it's bound and length chosen by the user
    static ModLinkedList GenerateLinkedList(int bound, int length){
        Random random = new Random();
        int root = random.nextInt(bound);
        ModLinkedList modLinkedList = new ModLinkedList();
        modLinkedList.root = new Node(root);
        for (int i = 0; i<length-1; i++){
            int a = random.nextInt(bound);
            modLinkedList.AddNode(a);
        }
        return modLinkedList;
    }

    //Prints the Linked List
    public void PrintList(){
        Node temp = root;
        while (root != null){
            System.out.println(root.data);
            root = root.next;
        }
        root = temp;
    }

    //new Node
    public Node getNode(int a){
        return new Node(a);
    }

    //add node at the end of the list
    public void AddNode(int d){
        Node toAdd = getNode(d);
        Node temp = root;
        while (root.next != null){
            root = root.next;
        }
        root.next = toAdd;
        root = temp;
    }
}
