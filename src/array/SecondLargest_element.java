package array;

public class SecondLargest_element {

    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6};
        int max = arr[0];
        int secLarg = -1;
        int n = arr.length;

        for (int i=1;i<n;i++){
            if(arr[i] > max) {
                secLarg = max;
                max = arr[i];
            }
//            }else if (arr[i] < max && arr[i] >secLarg ){
//                secLarg = arr[i];
//            }
        }
        System.out.println("The second largest element "+secLarg);
    }
}
