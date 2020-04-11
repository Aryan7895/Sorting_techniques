// As shifting process takes one third work of processor w.r.t. exchange process(swapping) ,so insertion sort is much
// more efficient than bubble sort and selection sort, as here only one assignment is performed ,unlike in swapping.!
import java.util.Arrays;

public class InsertionSort {
    public void InsertionSortMethod(int arr[]){
        int temp,j,i;
        for(i=1;i<arr.length;i++){
            temp=arr[i];
             j=i;
            while(j>=1 && arr[j-1]>temp ){
                arr[j]=arr[j-1];
                j--;
                System.out.println("in between pass ="+ Arrays.toString(arr));
                System.out.println(j);
            }
            arr[j]=temp;
            System.out.println("after complete pass ="+ Arrays.toString(arr));

        }
    }
    public static void main(String args[]){
        int []arr={1,2,3,4,5,10,9,8,7,6};
        InsertionSort i =new InsertionSort();
        i.InsertionSortMethod(arr);
    }
}
