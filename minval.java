public class minval{
    public static void main(String [] args){
        int[]arr = {4,5,23,50,65,90,12,15};

        int min = findmin(arr);
        System.out.println(min);

    }
    public static int findmin(int[]arr){
        int min = Integer.MAX_VALUE;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }
}