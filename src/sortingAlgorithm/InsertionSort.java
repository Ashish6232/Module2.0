package sortingAlgorithm;

public class InsertionSort {
    public static void insertionSort(int[]list){
        for (int i=0;i<list.length;i++){
            int value = list[i];
            int j = i;
            while (j>0 && list[j-1]>value){
                list[j]=list[j-1];
                j--;
            }
            list[j]=value;
        }
    }

    public static void main(String[] args) {
        int[]list={6,5,7,2,9,1};
        insertionSort(list);
        for (int arr:list) {
            System.out.println(arr);
        }
    }
}
