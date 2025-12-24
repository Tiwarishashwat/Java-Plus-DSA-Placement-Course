public class FunctionCalls {
    public void first(){
        System.out.println("hey first");
        second();
        System.out.println("bye first");
    }

     public void second(){
        
        third();
        System.out.println("hey second");
        System.out.println("bye second");
    }

    public void third(){
        System.out.println("I am third");
    }

    public static void main(String[] args) {
        FunctionCalls obj = new FunctionCalls();
        obj.first();
        System.out.println("Ended");
    }
}
