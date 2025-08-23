##  Multi-Catch Block
in java 7, multi-catch blocks were introduced, so we can handle multiple exceptions in same way by catching them in same catch block, exceptions are seperated with "|" symbol.
```java
public class MultiTryCatchDemo {
    public static void main(String[] args) {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[2]);

            String s = "shashwat";
            System.out.println(s.length());

            System.out.println(5/2);

        }
        catch (ArithmeticException e){
            System.out.println("you cannot divide by zero: " + e);
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Either array index problem OR null pointer problem: " + e);
        }
        catch (Exception e){
            System.out.println("Received some other exception");
        }
    }
}

```
> When using multiple catch blocks, always catch the more specific (child) exceptions first and then the more general (parent) exceptions.
For example, in the code above we catch ArithmeticException, ArrayIndexOutOfBoundsException, and NullPointerException before Exception, because Exception is the parent class of all these exceptions.
If we put Exception first, it would catch all exceptions and the later specific catch blocks would become unreachable, causing a compile-time error.

---