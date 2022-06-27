public class hw8p4 {
    public static int[][] mirror(int[][] x){
        // reverse order of arrays/rows. Assume NO ragged arrays
        int[][] revArray = new int[x.length][x[0].length];
        System.out.println("x length: " + x.length);
        int n = 0;
        // get amount of arrays/rows
        for(int i = x.length; i > 0; i--){
            // reverse arrays/rows
            revArray[n] = x[i-1];
            n++;
        }
        return revArray;
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                        {8, 9, 31, 4, 29, 12},
                        {7, 23, 73, 12, 6, 30},
                        {13, 42, 42, 18, 5 ,15},
                        {4, 7, 32, 43, 15, 17}
                        };

        int[][] arr2 = {
                        {32, 45, 67, 21, 3, 8},
                        {12, 65, 23, 27, 12, 18},
                        {19, 32, 14, 18, 19, 27},
                        {39, 48, 29, 26, 32, 44},
                        {17, 28, 37, 38, 22, 19}
                        };

        int[][] mirrorArray = mirror(arr2);
        for(int i = 0; i < mirrorArray.length; i++){
            for(int j = 0; j < mirrorArray[i].length; j++){
                System.out.print(mirrorArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
