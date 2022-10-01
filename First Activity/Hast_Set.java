import java.util.*;
public class Hast_Set{


    public static void main(String args[]) throws InterruptedException{
        HashSet<String> set=new HashSet<String>(5);      
       
        Scanner s = new Scanner(System.in);
        System.out.println("Your Top 05 List of Movies");
        Thread.sleep(5000);
        System.out.println(" ");
        for(int i = 0;i <= 5;){
            System.out.println("Input the first Movie: ");
            String ans1=s.next();
            set.add(ans1);
            System.out.println("Input the second Movie: ");
            String ans2=s.next();
            set.add(ans2);
            System.out.println("Input the third Movie: ");
            String ans3=s.next();
            set.add(ans3);
            System.out.println("Input the fourth Movie: ");
            String ans4=s.next();
            set.add(ans4);
            System.out.println("Input the fifth Movie: ");
            String ans5=s.next();
            set.add(ans5);
            break;
        }
        s.close();
        System.out.println("Your Top 05 List of Movies are: ");
        
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
    }
}
        
   