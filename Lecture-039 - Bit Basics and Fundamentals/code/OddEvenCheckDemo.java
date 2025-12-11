public class OddEvenCheckDemo {
    public boolean isEven(int num){
        return (num & 1)==0;
    }
    public static void main(String[] args) {
        OddEvenCheckDemo o = new OddEvenCheckDemo();
        int num=11;
        String res = o.isEven(num)?"EVEN" : "ODD";
        System.out.println(num + " is " + res);
    }
}
