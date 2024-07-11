
public class ArrayPractice{

    public static void binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
       
        boolean found = false;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                System.out.println("Key found");
                found = true;
                break;
            }else if(key<arr[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        if(!found){
            System.out.println("Key is not present inside the given array");
        }
    }

    public static void printArray(int arr[]){
        int arrSize = arr.length;
        for(int i=0; i<arrSize; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    public static void reverseTheArray(int arr[]){
        int arrSize = arr.length;
        printArray(arr);
        for(int leftIdx=0; leftIdx<=(arrSize-1)/2; leftIdx++){
            int rightIdx = arrSize-1-leftIdx;
            int temp = arr[leftIdx];
            arr[leftIdx] = arr[rightIdx];
            arr[rightIdx] = temp;
            System.out.println(rightIdx);
        }
        printArray(arr);
    }

    public static void findPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                System.out.print("{"+arr[i]+", " + arr[j]+"} ");
            }
        }
        System.out.println();
    }

    public static void printSubarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){

                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String args[]){
        // int arr[] = {3, 55, 66, 77, 84, 94, 100, 222, 444};
        int arr[] = {1, 2, 3, 4};
        int key = 55;
        // binarySearch(arr, key);
        // reverseTheArray(arr);
        // findPairs(arr);
        // printSubarray(arr);

    }
}