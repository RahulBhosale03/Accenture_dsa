package array;

public class Frequency_count01 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 1, 4, 2};
        int n = arr.length;
        int[] freq = new int[n];

        for(int num:arr){
            freq[num]++;
        }

        for(int i=0;i< freq.length;i++){
            if (freq[i] > 0){
                System.out.println(i + "->"+ freq[i]);
            }
        }
    }
}
