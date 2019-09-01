package javaexercise;
import java.util.Scanner;

public class Mjehuric {
	public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] inputs = new int[5];
        for(int i = 0; i<inputs.length; i++){
            inputs[i] = sc.nextInt();
        }

        bubbleSort(inputs);
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i<arr.length; i++){
            for(int j = 1; j<n-i; j++){
                if(arr[j-1] > arr[j]){
                    // swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]= temp;                    
                    for (int k = 0; k < arr.length; k++){
                        System.out.print(arr[k] + " ");                       
                    }
                    
                    System.out.println();
                }
            }     
            
        }
    }

}
