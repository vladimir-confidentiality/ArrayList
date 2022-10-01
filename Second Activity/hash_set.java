import java.util.*;
public class hash_set {
    public static void menu(){
        HashSet<Integer> hashset= new HashSet<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            boolean go = true; 
            boolean run = true;
           
            while (go == true) {
                while (run == true) {

                    System.out.println("""
                        Choices
                        1 to Add
                        2 to Remove
                        3 to Display
                        4 to Clear
                        5 to Exit
                    """);

                    System.out.println("Choice: ");
                    int choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.println("Add a number: ");
                        
                        int  add = sc.nextInt();
                       
                        while (true) {
                            if (hashset.contains(add) ){
                                System.out.println("Number Already Exist...");
                                System.out.println("");
                                System.out.println("Add a number: \n");
                                add = sc.nextInt(); 
                            }else{
                                hashset.add(add);
                                System.out.println("Has been added");
                                break;
                            } 
                        
                        }
                       
                    } else if (choice == 2) {
                        System.out.println("Input a number to remove: ");

                        int remove = sc.nextInt();

                        hashset.remove(Integer.valueOf(remove));
                        System.out.println("");
                    } else if (choice == 3) {

                        System.out.println("Array ="+hashset);
                        System.out.println("");
                    } else if (choice == 4) {
                        hashset.clear();
                        System.out.println("");
                        System.out.println("Successfully Cleared..");
                        System.out.println("");
                    } else if (choice == 5) {
                        run = false;
                        if (run == false) {
                            System.out.println("Like to run the program again?: Y/N");
                            char again = sc.next().charAt(0);
                            again = Character.toUpperCase(again);
                            if (again == 'Y') {
                                run = true;
                            } else if (again == 'N') {
                                System.out.println("Thanks for using the program.");
                                go = false;
                                System.exit(0);
                            } else {
                                System.err.println("Invalid. You may try again.");
                            }
                        }
                        
                    } else  {
                        System.err.println("Invalid option selected...");
                        run = false;
                        if (run == false) {
                            System.out.println("Like to run the program again?: Y/N");
                            char again = sc.next().charAt(0);
                            again = Character.toUpperCase(again);
                            if (again == 'Y' || again == 'y') {
                                run = true;
                            } else if (again == 'N' || again == 'n') {
                                System.out.println("Thanks for using the program.");
                                go = false;
                                System.exit(0);
                            } else {
                                System.err.println("Invalid. You may try again.");
                            }
                        }
                    }

                }
                
            }

        }
    }
        

    
    public  static void main(String [] args){
      
        menu();
    }
}
