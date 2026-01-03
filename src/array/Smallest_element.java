package array;

public class Smallest_element {

    public static void main(String[] args) {
        int arr [] = {5,4,3,1,2};
        int small = arr[0];
        int n = arr.length;

        for(int i=1;i<n;i++){
            if(arr[i] < small){
                small = arr[i];
            }
        }
        System.out.println("Smallest element " + small);
    }
}
