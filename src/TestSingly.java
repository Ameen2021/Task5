import java.util.LinkedList;

/**
 * Created by LAB on 2/21/2021.
 */
public class TestSingly {
    public static void main(String[] args) {
        SinglyLinkedList<Integer>list= new SinglyLinkedList<>();
        SinglyLinkedList<Integer>list1=new SinglyLinkedList<>();
        SinglyLinkedList<Integer>list2=new SinglyLinkedList<>();
        list.addFirst(11);
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(14);
        list1.addFirst(15);
        list1.addFirst(16);
        list1.addFirst(17);
        list1.addFirst(18);

        list2= list2.Merege(list,list1);

        System.out.println(list2.print());
    /*   System.out.println(list.print());

        list.reversList(list);
        System.out.println(" the revers List"+list.print());
        list.findSecondList();
        list.findSize();
       list.Rotate(2);

        //System.out.println(" the Rotate Element \n"+list.print());
        list.reversList(list);

       /* int n= list.size();
        for (int i = 0; i <n ; i++) {

            System.out.println(list.removeFirst());
        }
        System.out.println(list.size());*/
    }
}
