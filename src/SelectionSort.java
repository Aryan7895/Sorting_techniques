import java.util.Arrays;

public class SelectionSort {
    public void SelectionSortMethod(int arr[]){
        for(int i= arr.length-1;i>=1;i--){
             int max=i;

            for(int j=0;j<=i;j++) {

                if (arr[j] > arr[max])
                    max = j;

            }
                    int temp = arr[i];
                    arr[i] = arr[max];
                    arr[max] = temp;


                System.out.println("unsorted array = "+ Arrays.toString(arr));
            }
        System.out.println("sorted array ="+ Arrays.toString(arr));
    }
    public static void main(String args[]){
        int arr[] ={33,4,2,544,21,78,6};
        SelectionSort s=new SelectionSort();
        s.SelectionSortMethod(arr);
    }
}
