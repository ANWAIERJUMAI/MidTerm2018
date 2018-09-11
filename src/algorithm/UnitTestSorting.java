package algorithm;

import org.testng.Assert;

import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        int temp;
        for (int i = 1; i < unSortedArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (unSortedArray[j] < unSortedArray[j - 1]) {
                    temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j - 1];
                    unSortedArray[j - 1] = temp;
                }
            }
        }

        for (int n = 0; n < unSortedArray.length; n++) {
            System.out.println(unSortedArray[n]);

            int temp1;
            for (int i = 1; i < sortedArray.length; i++) {
                for (int j = i; j > 0; j--) {
                    if (sortedArray[j] < sortedArray[j - 1]) {
                        temp = sortedArray[j];
                        sortedArray[j] = sortedArray[j - 1];
                        sortedArray[j - 1] = temp;
                    }
                }
            }

            for (int n1 = 0; n < sortedArray.length; n++) {
                System.out.println(sortedArray[n]);

                //Create Sort object
                Sort sort = new Sort();
                //apply unsorted array to selectionSort.
                sort.selectionSort(unSortedArray);
                System.out.println(sort.selectionSort(unSortedArray));

                //verify if the unsorted array is sorted by the selection sort algorithm.
                try {
                    Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
                } catch (Exception ex) {
                    ex.getMessage();
                }

                //Now implement Unit test for rest of the soring algorithm...................below


            }
        }
    }}