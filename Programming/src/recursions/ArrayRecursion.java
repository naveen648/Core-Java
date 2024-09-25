package recursions;

import java.util.Arrays;

public class ArrayRecursion {
	
	public static void main(String[] args){
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int par=0;
        func(par,arr);
        
    }

    public static void func(int i, int[] arr) {

        int l=arr.length-i-1;
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;

        if(i==(arr.length/2)-1){
            System.out.println(Arrays.toString(arr));
            return ;
        }
        func(i+1,arr);
        
    }
}
