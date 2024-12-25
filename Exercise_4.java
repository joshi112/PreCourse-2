// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class MergeSort
{
    // Merges two subarrays of arr[]. 
    // First subarray is arr[l..m] 
    // Second subarray is arr[m+1..r] 
    void merge(int arr[], int l, int m, int r)
    {
        //Your code here
        int n1 = m -l;
        int n2 = r - (m+1);

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[l+i];
        }

        for(int j=0;j<n2;j++){
            R[j] = arr[m+1+j];
        }

        int i=0,j=0,k=l;
        int smallest =0;
        while(i< n1 && j < n2){
            if(L[i] <= R[j]){
                smallest = L[i];
                i++;
            }else{
                smallest =R[j];
                j++;
            }
            arr[k] = smallest;
            k++;
        }

        while(i< n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j< n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if(l< r) {
            int mid = (l + r) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }

        //Write your code here
        //Call mergeSort from here 
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method 
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
} 