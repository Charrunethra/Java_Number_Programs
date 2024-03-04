import java.util.*;
public class Reverse_a_number {
    //123 o/p: 321
    //leetcode 7 : Reverse integer
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        while(num != 0){
            int temp = num % 10; //1
            result = result * 10 + temp; //0 + 1 = 1
            num /= 10;
            //for big integer --> if it exceeds the limit of int, (the last digit of result) result % 10 != temp
            if(result % 10 != temp)
                System.out.println(0); // this is when the input is x = 1534236469
        }
        System.out.println(result);
    }
}
