class Main {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        int positive =0;
        int negative =0;
        int zero=0;
        //boolean isFound = false;
        for(int num:arr){
            if(num==0){
                zero++;
            }
            else if(num%2==0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positives are: "+ positive);
        System.out.println("negatives are: "+ negative);
        System.out.println("zeros are: "+ zero);
        }
}