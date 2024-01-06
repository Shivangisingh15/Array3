public class subarray1 {
    public static void subarray1(int[]arr){
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for (int k =0;k<=j;k++){
                    System.out.println(arr[k]+"");
                }
                System.out.println();
            }
        }
    }

public static void main(String[]args){
    int[]arr={1,2,3,4,5,6};
    subarray1(arr);
}
}
