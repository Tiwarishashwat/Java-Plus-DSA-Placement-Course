import java.util.*;
class Assignment {
public static void main(String args[]){
	int num = 0;
	System.out.println("Enter a number");
	Scanner obj = new Scanner(System.in);
	num = obj.nextInt();
	int copy = num;
	int times = 0;
	// First Approach
	while(num>0){
		num = num/2;
		times++;
		if(times >= 5 ){
			System.out.println("Exit the loop");
			break;
		}
		if(num%2==0){
			continue;
		}else{
			System.out.println("Number is "+ num);
		}
	}
	System.out.println("------Second Approach------");
	// Second Approach
	times = 0;
	while(copy>0){
		copy = copy/2;
		times++;
		if(times >= 5 ){
			System.out.println("Exit the loop");
			break;
		}
		// if odd then print otherwise it will automatically go 
		// to the next iteration as loop block ends after this
		// if statement.
		if(copy%2!=0){
			System.out.println("Number is "+ copy);
		}
	}
}
}