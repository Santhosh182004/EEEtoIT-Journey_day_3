
// Bubble sort algorithm -----> Bubble Sort compares two adjacent elements in an array and swaps them if they are in the wrong order.
//This process is repeated until the array is completely sorted.
import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
       for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
        System.out.println("The Sorted array in ascending order using bubble sort algorithm is : ");
    for(int i = 0; i < n; i++) {
    if(i != n - 1)
        System.out.print(arr[i] + ",");
    else
        System.out.print(arr[i]);  // last element – no comma
}

    }
}
