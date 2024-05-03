public class ArraySorter {
    public static void merge(int[] A, int n1, int[] B, int n) {
        // n1    is the elements in A that is real data
        // n is the number of elements that corresponds to B 
        int i = n1 - 1; // final element in Data A
        int j = n - 1; // final element in B 
        int k = n1 + n - 1; //in the buffer of  A 

        
        while (j >= 0) { // merging a into b as per requirement 
            if (i >= 0 && A[i] > B[j]) { //comparing elements from A to B 
                A[k] = A[i];              
                i--; // derementing I and K 
            } else {
                A[k] = B[j];
                j--; //decrementing j AND k
            }
            k--;
        }
    }
}


// THE time complexity is O(m +n) , since the complexity is linear
// Space complexity is O(1), since no additional space is required

