package searchAlgorithm;

public class SearchRecursion {

       public static int recursion(int[]a,int low,int hi,int value) {
        int mid = (low + hi) / 2;
        if (low > hi) {
            return -1;
        } else {
            if (value == a[mid]) {
                return mid;
            }
            if (value > a[mid]) {
                return recursion(a,mid+1,hi,value);
            } else {
                return recursion(a,low,mid-1,value);
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        int value =7;
        SearchRecursion t = new SearchRecursion();
        System.out.println(recursion(arr,1,4,6));
    }
}
