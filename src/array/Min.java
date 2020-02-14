package array;

public class Min {
    public static int findMin(int[]array){
        int min = array[0];
        for (int i=1;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[]array = {4,6,8,7,1,0};
        System.out.println("smallest in array:" + findMin(array));
    }
}
