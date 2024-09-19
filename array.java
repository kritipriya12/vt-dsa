//package JavaBasics;
public class array{
    public static void main (String [] args){
        //creation 
        //int[]arr = new int [10];

         //insertion
         //arr[0] = 10;
         //arr[1] = 20;
         //arr[2] = 30;

        /*for (i= 0; i<10; i++){
            arr[i]=i}

            System.out.println(arr[2]);

            //iteration 
            for (int i= 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");

            }*/
        
           //searching
           // linear search
         // int[] arr = {1,2,3,4,5,6,7,8,9};
          //int target =6;
          //for (int i= 0; i<arr.length; i++){
            //if (arr[i] == target){
               // System.out.print(i);
           // }
         // }
       // }
   // }
         


         //int [] arr = {25,20,23,21,20};
        // int sumEven = 0;

        // for (int i = 0; i< arr.length; i++){
            //if (i%2 == 0){
               // sumEven += arr[i];

            // }
         // }
         // System.out.println(sumEven);


         // check occurances
         int[] arr= {25,20,23,21,20};
         int target = 20;
         int ans = 0;
         for (int i=0;i< arr.length; i++){
            if (target == arr[i]){
                ans++;
            }
         }
         System.out.println(ans);
        }
     }

     // sum of max and min
     
     