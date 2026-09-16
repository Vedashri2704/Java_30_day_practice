import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double rad;
        double pi = 3.14;
        System.out.println("Enter radius:");
        rad = sc.nextDouble();
        System.out.println("area is : "+(pi*rad*rad));

    }
}