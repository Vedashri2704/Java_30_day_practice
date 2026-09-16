import java.util.Scanner;
class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("marks in Sci: ");
        float sci = sc.nextFloat();
        System.out.println("marks in mat: ");
        float mat = sc.nextFloat();
        System.out.println("marks in eng: ");
        float eng = sc.nextFloat();
        float percentage = (sci+mat+eng)*100/300;
        System.out.println("Percentage is :"+ percentage);
    }
}
