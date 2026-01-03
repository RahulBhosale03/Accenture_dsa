package array;

public class Largest_element {
    public static void main(String[] args) {

        int arr[] = {1,2,5,3,4};
        int max = arr[0];
        int n = arr.length;

        for(int i=1;i<n;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element " + max);
    }
}
