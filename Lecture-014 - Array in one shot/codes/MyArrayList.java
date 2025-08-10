import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        System.out.println("element " + arrayList.get(0));

        for(int i=0;i<arrayList.size();i++){
            System.out.println("after insert element at " + i + " index is " + arrayList.get(i));
        }

        //update
        arrayList.set(1,20);

        for(int i=0;i<arrayList.size();i++){
            System.out.println("after update element at " + i + " index is " + arrayList.get(i));
        }

        //delete
        arrayList.remove(0);
        for(int i=0;i<arrayList.size();i++){
            System.out.println("after delete element at " + i + " index is " + arrayList.get(i));
        }

        //insert with shift
        arrayList.add(0,100);
        for(int i=0;i<arrayList.size();i++){
            System.out.println("after insert with shift element at " + i + " index is " + arrayList.get(i));
        }


    }
}
