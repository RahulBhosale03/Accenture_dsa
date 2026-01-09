package array;

public class MoveZeros01 {
    public static void main(String[] args) {
//        int [] arr = {0, 1, 0, 3, 12};
        int [] arr = {1};
        int size = arr.length;

//        if(size == 1 || size == 0){
//            System.out.println(arr);;
//        }

        int nz = 0,z = 0;

        while(nz < size){
            if(arr[nz] != 0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }else {
                nz++;
                System.out.println();
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
