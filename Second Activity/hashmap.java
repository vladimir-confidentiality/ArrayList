import java.util.*;

public class hashmap {

    public static boolean isPrime(int in) {
        if (in < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(in); i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     */
    public static void menu() {
        HashMap<Integer, String> hash = new HashMap<Integer, String>(5);
        try (Scanner s = new Scanner(System.in)) {
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
                    int result = s.nextInt();
                    if (result == 1) {
                        System.out.println("Key: ");
                        int add = s.nextInt();
                        System.out.println("Value: ");
                        String added = s.next();
                        while (true) {
                            if (isPrime(add)) {
                                System.out.println("You input a prime number!");
                                System.out.println("");
                                System.out.println("Key: ");
                                add = s.nextInt();
                                System.out.println("Value: ");
                                added = s.next();
                            } else {

                                hash.put(add, added);
                                System.out.println("Has been added...");
                                break;
                            }
                        }
                    } else if (result == 2) {
                        System.out.println("Input a number to remove: ");
                        int remove = s.nextInt();
                        hash.remove(Integer.valueOf(remove));
                        System.out.println("");
                    }

                    else if (result == 3) {
                        System.out.println(hash);
                        System.out.println("");
                    } else if (result == 4) {
                        System.out.println("");
                        hash.clear();
                        System.out.println("Successfully Cleared..");
                        System.out.println("");
                    } else if (result == 5) {
                        run = false;
                        if (run == false) {
                            System.out.println("Like to run the program again?: Y/N");
                            char again = s.next().charAt(0);
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

                    } else {
                        System.err.println("Invalid option selected...");
                        run = false;
                        if (run == false) {
                            System.out.println("Like to run the program again?: Y/N");
                            char again = s.next().charAt(0);
                            again = Character.toUpperCase(again); 

                            
                        }
                    }
                }
            }
        }
    

    }

    public static void main(String[] args) {
        menu();
    }

}