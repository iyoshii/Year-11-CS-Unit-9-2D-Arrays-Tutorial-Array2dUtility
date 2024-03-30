
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] array){
        for(int[] row : array){
            for(int[] num : array){
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] array){
        int sum = 0;

        for(int[] row : array){
            for(int num : row){
                sum += num;
            }
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] array){
        int sum = sum(array);
        int total = array.length;
        return (double) sum / (total * total);
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.

    public static int minimum(int[][] array){
        int min = array[0][0];

        for(int[] row : array){
            for(int num : row){
                if(num < min){
                    min = num;
                }
            }
        }

        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.

    public static int maximum(int[][] array){
        int max = array[0][0];

        for(int[] row : array){
            for(int num : row){
                if(num > max){
                    max = num;
                }
            }
        }

        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.

    public static int evenCountStandard(int[][] array){
        int count = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                int num = array[i][j];

                if(num % 2 == 0){
                    count++;
                }
            }
        }

        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.

    public static int evenCountEnhanced(int[][] array){
        int count = 0;

        for(int[] row : array){
            for(int num : row){
                if(num % 2 == 0){
                    count++;
                }
            }
        }

        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.

    public static boolean allPositive(int[][] array){
        for(int[] row : array){
            for(int num : row){
                if(num < 0){
                    return false;
                }
            }
        }

        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.

    public static int[] rowSums(int[][] array){
        int[] sum = new int[array.length];

        int rowIndex = 0;

        for (int[] row : array) {
            int rowSum = 0;

            for (int num : row) {
                rowSum += num;
            }

            sum[rowIndex] = rowSum;
            rowIndex++;
        }

        return sum;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

    public static int[] colSums(int[][] array) {
        int cols = array[0].length;
        int[] sum = new int[cols];

        for (int i = 0; i < cols; i++) {
            int colSum = 0;

            for (int[] row : array) {
                colSum += row[i];
            }

            sum[i] = colSum;
        }

        return sum;
    }

}
