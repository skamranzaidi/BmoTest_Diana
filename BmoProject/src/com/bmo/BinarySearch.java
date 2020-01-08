package com.bmo;

public class BinarySearch {
// compare x with the middle element.
//If x matches with middle element, we return the mid index.
//Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
//Else (x is smaller) recur for the left half.
     public int binarySearch(int arr[], int x)
        {
            int l = 0, r = arr.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
               if (arr[m] == x)
                    return m;
                if (arr[m] < x)
                    l = m + 1;
                else
                    r = m - 1;
            }
            return -1;
        }
    }
