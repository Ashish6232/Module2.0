package searchAlgorithm;

public class SearchNotRecusion {

    public int binarySearch(int[]a,int value) {
        int size = a.length;
        int low = 0;
        int hi = size - 1;

        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (value==a[mid]){
                return mid;
            }
            if (value > a[mid]) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        int value =7;
        SearchNotRecusion t = new SearchNotRecusion();
        System.out.println(t.binarySearch(arr,value));
    }
}
