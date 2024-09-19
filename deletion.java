public class deletion{
    public static void main(String[] args){
        int[] arr = {4,5,6,3,7,12,20,50};
        int target = 7;

        int newsizeAfterDeletion = deleteElement (arr, arr.length, target);

          for (int i = 0; i < newsizeAfterDeletion; i++){
            System.out.println(arr[i]+ " ");
          }
        }
        public static int deleteElement (int[]arr, int n, int target){
          int deletedElementIndex = findElement(arr, n, target);

             for(int i = deletedElementIndex; i < n - 1; i++){
            arr[i] = arr[i+1];
          }
        
         return n - 1;
         }
    
    
    public static int findElement (int[]arr, int n, int target){

        for(int i = 0; i<n; i++){
            if (arr[i] == target){
                return i;

            }
        }
        return -1;
    }
}