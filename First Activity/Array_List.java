import java.util.*;

public class Array_List{

    public static void main(String args[]) throws InterruptedException{
        ArrayList<String> array= new ArrayList<String>(5);
        
        Scanner s = new Scanner(System.in);
        System.out.println("Your Top 05 List of Movies");
        Thread.sleep(5000);
        System.out.println(" ");
        for(int i = 0;i <= 5;){
            System.out.println("Input the first Movie: ");
            String ans1=s.next();
            array.add(ans1);
            System.out.println("Input the second Movie: ");
            String ans2=s.next();
            array.add(ans2);
            System.out.println("Input the third Movie: ");
            String ans3=s.next();
            array.add(ans3);
            System.out.println("Input the fourth Movie: ");
            String ans4=s.next();
            array.add(ans4);
            System.out.println("Input the fifth Movie: ");
            String ans5=s.next();
            array.add(ans5);
            break;
        }
        s.close();
        System.out.println("Your Top 05 List of Movies are: ");
        for (String Colors: array) {
            System.out.println(Colors);
        }
    }
}