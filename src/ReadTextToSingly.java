import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by LAB on 2/21/2021.
 */
public class ReadTextToSingly {
    public static void main(String[] args) {
        SinglyLinkedList<String> list= new SinglyLinkedList<>();

        try {
            Scanner input=new Scanner(new File("F:\\DS_Lab5\\Students.txt"));

        while (input.hasNext())
        {
          list.addLast(input.nextLine());
        }
            System.out.println(list.print());




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
