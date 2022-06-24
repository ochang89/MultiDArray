
public class MultiDArray1 {
    public static boolean isRowMagic(int[][] arr){
        int sum = 0;
        int[] arr1 = new int[arr.length];
        // iterate through arr
        //for all 3 rows
        for(int row = 0; row < arr.length; row++){
            // get 4 values for each row
            for(int col = 0; col < arr[row].length; col++){
                // sum each arr (row)
                sum += arr[row][col];
            }
            // store current sum into placeholder arr1[row]
            arr1[row] = sum;
            System.out.println(arr1[row]);
            // reset sum to grab sums of other arrays
            sum = 0;
        }
        // if all rows are the same sum, return true
        for(int i = 0; i < arr1.length-1;i++) {
            if(arr1[i] == arr1[i+1]) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[][] test = {{4,9,5,2},{3,10,1,6},{13,1,2,4}};
        int[][] test1 = {{4, 8, 7},{2,9,6}};
//        int[][] test2 = {{31,1,-1,15,10},{21,18,5,4,8}};

        System.out.println(isRowMagic(test1));
    }

}
