public class Subject {
    public String name;
    public String lang;
    
    Subject(String name, String lang){
        this.name = name;
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public String getLang() {
        return lang;
    }
}