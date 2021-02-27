import java.util.LinkedList;

/**
 * Created by LAB on 2/21/2021.
 */
public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public boolean isEmpty() {

        return size == 0;
    }

    public int size() {
        return size;

    }

    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E element) {
        head = new Node<>(element, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E element) {
        Node<E> newest = new Node<E>(element, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if(isEmpty())return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;

        if (size == 0)
            tail = null;
        return deleted;
    }
    public  void findSecondList(){
        Node <E> s=head;
        if(isEmpty()) System.out.println("the LinkedList is null");
        else if(s.next==null){
            System.out.println("there is only one node");
        }
        while (s.next.next !=null){
        s=s.next;
        }
        System.out.println("The secondeElement in singlyLinkedList is "+s.getElement());
    }
    public void findSize()
    {
        Node<E> Size=new Node(0,head);
        int counter=0;
        while (Size.next!=null)
        {
          counter++;
            Size=Size.next;
        }
        System.out.println(" the size of the LinkedList = "+counter);
    }
    public void Rotate(int element)
    {

        for (int i = 1; i <=element ; i++) {
            addLast(removeFirst());
        }

    }
    public SinglyLinkedList reversList(SinglyLinkedList list){
        Node <E> prev=null;
        Node<E> courent=list.head;
        Node <E> Next=null;
        while (courent !=null)
        {
            Next=courent.next;
            courent.next=prev;
            prev=courent;
            courent=Next;
        }
        list.head=prev;
        return list;
    }
    public SinglyLinkedList Merege(SinglyLinkedList list1,SinglyLinkedList list2)
    {


        if(list1==null){
            return list2;}
        Node<E> list=list1.head;
        while (list.next!=null)
        {
           list=list.next;
        }
      list.next=list2.head;
        return list1;
    }


    public String print()
    {
        Node<E>i=head;
        String x="" ;
        while (i!=null)
        {
            x=x+i.getElement().toString()+"\n";
            i= i.getNext();
        }
        return x;
    }

    private static class Node<E> {
      private   E element;
       private   Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
