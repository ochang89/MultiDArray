public class hw8p3 {
    public static int[] linearize(int[][] arr){
        int sumLength = 0;

        // add all array lengths (row lengths) to get new array length
        for(int i = 0; i < arr.length; i++){
            sumLength += arr[i].length;
        }
        int[] array = new int[sumLength];

        // create counter for each index of the total length of the new array
        int rowLength = 0;

        // copy all elements to a 1D array. compensate for ragged arrays
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                array[rowLength] = arr[i][j];
                rowLength++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] arr = {
                        {8, 9, 31},
                        {7, 23, 73, 24},
                        {13, 19}
                        };

        int[][] arr1 = {
                    {32, 13, 45},
                    {12, 100, 56, 94},
                    {19},
                    {32, 120},
        };
        int[] linearArray = linearize(arr);
        for(int i = 0; i < linearArray.length; i++){
            System.out.print(linearArray[i] + " ");
        }
    }
}
