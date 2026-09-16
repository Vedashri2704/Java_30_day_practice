//°F = (°C × 1.8) + 32
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cel;
        int far;
        System.out.println("Enter Celcious:");
        cel = sc.nextInt();
        System.out.println("Faranite is : "+ ((cel * 1.8)+32));

    }
}
