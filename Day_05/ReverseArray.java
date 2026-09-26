class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("Original: ");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("after reversing: ");
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
            
        }
    }
}
