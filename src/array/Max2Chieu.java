package array;

public class Max2Chieu {
    public static void main(String[] args) {
        int[][]arr={
                {1,8,3},
                {4,5,9},
                {7,5,3}
        };
        int max=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("max is "+max);
    }
}
