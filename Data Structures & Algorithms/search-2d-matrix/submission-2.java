class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int left = 0;
        int right = matrix.length - 1;

        int matrixIndex = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            int last = matrix[left].length - 1;
            if(matrix[mid][last] < target){
                left++;
            }
            else if(matrix[mid][0] > target){
                right--;
            }
            else{
                matrixIndex = mid;
                break;
            }
        }

        left = 0;
        right = matrix[0].length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[matrixIndex][mid] == target){
                return true;
            }
            else if(matrix[matrixIndex][mid] > target){
                right--;
            }
            else{
                left++;
            }
        }


        return false;



    }
}
