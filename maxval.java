public class maxval{
    public static void main(String [] args){
        int[]arr = {4,5,23,50,65,90,12,15};

        int max = findmax(arr);
        System.out.println(max);

    }
    public static int findmax(int[]arr){
        int max = Integer.MIN_VALUE;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}