class Main {
    public static void main(String[] args) {
        int sum =0;
        int[] num ={10,20,30,40,50};
        int max = num[0];
        //int max =0;
        for(int i =0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
            
       System.out.println("Max is : "+max);
    }
}