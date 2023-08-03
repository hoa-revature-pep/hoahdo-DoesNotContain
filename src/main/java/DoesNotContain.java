
public class DoesNotContain {
    /**
     * The inverse of the contains value challenge: check if the array does *not*
     * contain the value.
     * You should think critically about the logic that you write within the for
     * loop.
     *
     * For a trickier problem like this, you should try explaining your thought
     * process of working
     * through this problem with pencil and paper in plain English before attempting
     * it in code.
     * For instance: for the contains problem, your code had to check every value to
     * see if the value
     * matches the target, and if it matched the target, the array was sure to
     * contain the target. Think
     * of a similar process here.
     *
     * @param arr    the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target. false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target) {

        for (int x = 0; x < arr.length; x++) {
            boolean doesContain = (target == arr[x]);

            if (doesContain) {
                return false;
            }

        }

        return true;
    }
}

// create 2nd array to hold value of checks
// check each index if it matches target
// if match, replace index of 2nd array with 1
// if no match, replace index of 2nd array with 0
// create placeholder variable
// sum up all values in 2nd array
// if sum is equal to 0, return true
// else return false






























// public boolean arrayDoesNotContain(int[] arr, int target) {

// int[] checkArray = new int[arr.length];
// int sumOfCheckArray = 0;

// for (int x= 0; x < arr.length; x++) {
// if(arr[x] == target) {
// checkArray[x] = 1;
// } else {
// checkArray[x] = 0;
// }
// }

// for (int y = 0; y < checkArray.length; y++) {
// sumOfCheckArray = sumOfCheckArray + checkArray[y];
// }

// if (sumOfCheckArray == 0) {
// return true;
// } else {
// return false;
// }

// }

// public boolean arrayDoesNotContain(int[] arr, int target) {

// int matches = 0;

// for (int x = 0; x < arr.length; x++) {
// boolean doesContain = (target == arr[x]);

// if(doesContain) {
// matches = 1;
// }

// }

// if(matches == 0) {
// return true;
// }

// return false;
// }