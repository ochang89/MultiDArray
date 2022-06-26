public class hw8 {
    public static void main(String[] args) {
        char[] key = {'B','D','E','A','B','E','E','D','E','B'};
        char[][] students = {
                {'A', 'D','B','A','B','E','A','D','E','B'},
                {'B', 'C', 'E', 'C', 'E', 'E', 'E','D','E','B'},
                {'A', 'B', 'D', 'E', 'A', 'D', 'C', 'D', 'A', 'B'},
                {'B', 'B', 'D', 'E', 'B', 'E', 'C', 'C', 'A', 'D'},
                {'A', 'B', 'D', 'E', 'C', 'A', 'B', 'D', 'E', 'C'},
                {'A', 'B', 'D', 'E', 'D', 'C', 'E', 'B', 'C', 'E'},
                {'B', 'D', 'E', 'C', 'A', 'D', 'B', 'E', 'B', 'B'},
                {'C', 'D', 'D', 'C', 'B', 'E', 'A', 'D', 'E', 'B'},
                {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'A', 'C' ,'D'},
                {'B', 'E', 'E', 'A', 'A', 'E', 'A', 'B', 'E', 'B'},
                {'B', 'D', 'E', 'A', 'B', 'D', 'E', 'D', 'E', 'B'},
                {'B', 'D', 'E', 'C', 'B', 'E', 'B', 'D', 'C', 'E'},
        };

        int passed = numberOfStudentsPassed(students, key);
        System.out.println(passed + " students passed.");
    }
    public static int numberOfStudentsPassed(char[][] arr, char[] key){
        int count = 0;
        int[] scores = new int[12];

        // for each of 12 students. i represents each student
        for(int i = 0; i < arr.length; i++){
            // for each student's exam's 10 questions. j represents each of 10 questions
            for(int j = 0; j < arr[i].length; j++){
                // for each question, compare student answers to answer key
                if(arr[i][j] != key[j]){
                    // for student i, keep track of score
                    scores[i] -= 0;
                }
                else{
                    // count number correct, add 1
                    scores[i] += 1;
                }
            }
            // separate each student's scores
            if (scores[i] > 5){
                // number of students passed
                count += 1;
            }
        }
        // return number of students who passed exam (should be 7)
        return count;
    }
}
