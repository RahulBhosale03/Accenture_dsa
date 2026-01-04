package array;

public class Remove_Duplicate01 {

    public static int  removeDuplicate(int[]arr){

        int rd = 0;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[rd] != arr[i]){
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd+1;
    }

    public static void main(String[] args) {
        int[]arr={1,2,2,3,4,4,5};
        for (int i=1;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int rd = removeDuplicate(arr);
        System.out.println();

        for (int i=1;i<rd;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
