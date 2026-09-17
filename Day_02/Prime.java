import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        if(num>0){
            for(int i =1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("prime");
            }
            else{
                System.out.println("Not prime");
            }
    
        }
        else{
            System.out.println("NOt prime");
        }
    }
}