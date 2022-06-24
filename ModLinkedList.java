//import java.util.Random;

//my implementation of Linked List
public class ModLinkedList <T> {
    Node<T> root;

    //Node class
    static class Node <T> {
        Node<T> next;
        T data;

        Node (T d){ data = d;}
    }

    //generates random Linked List with it's bound and length chosen by the user
    // to make this class generic had to give up on generating random linked list :,)
    /*static <T> ModLinkedList<T> GenerateLinkedList(int bound, int length){
        Random random = new Random();
        Integer root = random.nextInt(bound);
        ModLinkedList<T> modLinkedList = new ModLinkedList<>();
        modLinkedList.root = (Node<T>) new Node<>(root);
        for (int i = 0; i<length-1; i++){
            int a = random.nextInt(bound);
            modLinkedList.AddNode(a);
        }
        return modLinkedList;
    }*/

    //Prints the Linked List
    public void PrintList(){
        Node<T> temp = root;
        while (root != null){
            System.out.println(root.data);
            root = root.next;
        }
        root = temp;
    }

    //new Node
    public Node<T> getNode(T a){
        return new Node<>(a);
    }

    //add node at the end of the list
    public void AddNode(T d){
        Node<T> toAdd = getNode(d);
        Node<T> temp = root;
        while (root.next != null){
            root = root.next;
        }
        root.next = toAdd;
        root = temp;
    }

    //add node at the start of the list
    // (EXTRA) ***add all the items from another list by using this O(1) constant time
    // and you get a LinkedList with reverse order of the original list***
    public void AddFirst(T d){
        Node<T> temp = root;
        root = new Node<>(d);
        root.next = temp;
    }
}
