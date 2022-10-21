import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        List<Subject> listOfSubjects = new ArrayList<Subject>();

        System.out.println("Here's Your Chosen Subjects!");
        System.out.println("Reminder: Non-integers are forbidden.");

        try{
            System.out.print("The number of subjects you want to choose: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                sc.close();
                throw new SubjectException("You entered a negative integer. Only positive index is accepted.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Name: ");
                String sub_name = sc.nextLine();

                System.out.print("Language used: ");
                String sub_lang = sc.nextLine();
    
                listOfSubjects.add(new Subject(sub_lang, sub_name));
            }

            System.out.println("");
            System.out.println("Your Chosen Subject!");
            System.out.println("=====================================");
            for(Subject list : listOfSubjects){
                System.out.println("Name: " + list.getName() + " || " + "Language used: " + list.getLang());    
            }
            System.out.println("=====================================");
            System.out.println("");

            input.close();
            sc.close();

        }
        catch(SubjectException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("You displayed a non-integer.");
        }

    }
}