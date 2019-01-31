import java.util.Scanner;

// Check palindrome but not convert to string.
public class Problem2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your value here:");
        int a = scanner.nextInt();
        System.out.print("\n"+ checkPalindrome1(a) + " " + checkPalindrome2(a));
    }
    private static boolean checkPalindrome1(int n){
        int temp = n;
        int reversed = 0;
        while (temp != 0){
            reversed = (reversed*10) + (temp%10);
            temp = temp/10;
        }
        return n == reversed;
    }
    private static boolean checkPalindrome2(int n){
        int first, last, divisor=1;

        while (n / divisor >=10){
            divisor *=10;
        }

        while (n != 0){
            first = n / divisor;
            last = n % 10;
            if (first != last){
                return false;
            }
            n = (n%divisor) /10 ;

            divisor = divisor/100;
        }

        return  true;
    }
}
