class Villan{
    void kidnap(){
        System.out.println("Villan is kidnapping");
    }
}

class Gabbar extends Villan{
    void asking(){
        System.out.println("Kitne aadmi the");
    }
}

public class DefaultClassDemo {
    public static void main(String[] args) {
        Gabbar v = new Gabbar();
        v.getClass(); //derived from object class.
    }

}
