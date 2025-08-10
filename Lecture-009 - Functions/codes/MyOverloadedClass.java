public class MyOverloadedClass {
    // number of arguments
    public void add(int a, int b){

    }

    public void add(int a){
        
    }

    public void add(){
        
    }

     public void add(float a, int b, int c){
        System.out.println("first -> " + (a+b+c));
    }

     public void add(int a, float b, int c){
        System.out.println("second -> " + (a+b+c));
    }

     public void add(int a, int b, int c){
        System.out.println("third -> " + (a+b+c));
    }

    public static void main(String[] args) {
        MyOverloadedClass obj = new MyOverloadedClass();
        int a=9;
        int b=7;
        int c=8;
        obj.add(a,b,c);
    }

}
