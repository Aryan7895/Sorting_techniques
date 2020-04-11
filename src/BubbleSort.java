import java.util.Arrays;

public class BubbleSort {
    public void BubbleSortMethod(int[] arr,int count) {
        for (int i = 0; i <= arr.length - 1; i++) {
           // int swapped = 0;
            for (int j = 0; j < arr.length - 1-i ; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
             //       swapped = 1;

                }

                System.out.println("unsorted= " + Arrays.toString(arr));
                count++;
            }

            System.out.println("Sorted = " + Arrays.toString(arr));

            //if (swapped==0)
            //break;

        }
        System.out.println("steps = " + count);

    }

 public static void main(String args[]){
        int count=0;
     int arr[]={1,2,6,3,9,12,45,13,14,17,99,18};
    BubbleSort b =new BubbleSort();
    b.BubbleSortMethod(arr,count);

    }
}
