import java.util.Arrays;

public class findDuplicate2 {
    public static void main(String[] args) {
        int arr[]={3,1,3,4,2};
        Arrays.sort(arr);
        int size=arr.length-1;

        for (int i = 0; i < size; i++) {
            if(arr[i]==arr[i+1] && i!=size){
                System.out.println(arr[i]);
            }
            
        }
        
    }
    
}
