public class SubjectException extends Exception {

    public SubjectException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "You displayed a non-integer.";
    }

}