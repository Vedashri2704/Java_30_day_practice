import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int digit = 0;
        while(n>0){
            digit = n%10;
            reverse = reverse*10+digit;
            n/=10;
        }
        
        System.out.println(reverse);
    }
}