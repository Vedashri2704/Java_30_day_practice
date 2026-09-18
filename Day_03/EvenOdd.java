class Main {
    public static void main(String[] args) {
        int even =0;
        int odd =0;
        int[] num ={10,23,35,40,50};
        //int min = num[0];
        //int max =0;
        for(int i =0;i<num.length;i++){
            if(num[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
            
       System.out.println("Even elements are : "+even);
        System.out.println("Odd elements are : "+odd);
    }
}