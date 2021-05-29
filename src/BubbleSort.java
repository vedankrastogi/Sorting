import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={12,8,5,16,2};//here we initialise the array
        BubbleSort obj= new BubbleSort();//we make the object of the class to call our method my bubble sort
        obj.myBubbleSort(arr);//with the help of object we call aur method
        System.out.println("sorted ---->" + Arrays.toString(arr));//with the help of arrays.toString method we can print our array
        // we dont need to write for loop to print elements in an array.

    }
    public void myBubbleSort(int [] arr){
        // step 1
        for (int i = 0; i < arr.length; i++) {
            // step 2     //arr.length-1;we can do so the no of iteration perform is one less than the no of elements present because as
            // there are 5 elements and if the 4 elements are sorted then the last element will automatically set to its right position.
            for (int j = 0; j < arr.length-1; j++) {
                //step 3      //arr.length-1-i; we can use this also to make our operation less this works as after first iteration the
                // last element reaches to its right sorted place it is not move anywhere so if we minus the i from the loop then there
                // is less no of operations.
                if(arr[j] > arr[j+1]){
                    // step 3.1 swap
                    int temp=arr[j];//here we take a temp variable which contains the arr[j[
                    arr[j]=arr[j+1];//now arr[j] equals to arr[j+1]
                     arr[j+1]=temp;//now arr[j+1]=temp theres swapping takes place
                }
            }
        }
    }
}
