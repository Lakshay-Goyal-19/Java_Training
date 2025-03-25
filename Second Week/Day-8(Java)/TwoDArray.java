import java.util.*;


// public class TwoDArray {
//     public static void main(String [] args){
//         //how to declare a 2D array in Java
//         // datatype[][] Name= new datatype[rows][cols];
//         int [][] arr =new int[3][3];
//         arr[2][2]=10;
//         System.out.println(arr[2][2]);
//         //how to initialize a two dimensinal array
//         int [][] a={
//             {1,2,3},
//             {1,2,3},
//             {1,2,3}
//         };
//     }
// }




//how to print the elements of the 2D array
// public class TwoDArray {
//     public static void main(String [] args){
//         int [][] a={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a[i].length;j++){
//                 System.out.print(a[i][j]+" ");
//             }
//            System.out.println();
//         }
//     }
// }



// public class TwoDArray {
//     public static void main(String [] args){
//         int [][] a={
//             {1,2,3},
//             {4,5,6},
//             {7,8,9}
//         };
//         // System.out.println(Arrays.toString(a));  //this method is only for one D array
//         System.out.println(Arrays.deepToString(a)); //this method is used for 2D arrays
//         for(int i=0;i<a.length;i++){
//             System.out.print("[ ");
//             for(int j=0;j<a[i].length;j++){
//                 System.out.print(a[i][j]+" ");
//             }
//            System.out.println("]");
//         }
//     }
// }



//jagged array
// public class TwoDArray {
//     public static void main(String [] args){
//         int [][] a={
//             {1,2,3},
//             {4,5},
//             {7,8,9}
//         };
//         // System.out.println(Arrays.toString(a));  //this method is only for one D array
//         System.out.println(Arrays.deepToString(a)); //this method is used for 2D arrays
//         for(int i=0;i<a.length;i++){
//             System.out.print("[ ");
//             for(int j=0;j<a[i].length;j++){
//                 System.out.print(a[i][j]+" ");
//             }
//            System.out.println("]");
//         }
//     }
// }



// public class TwoDArray {
//     public static void main(String [] args){
//         int [] a={1,2,3};
//         System.out.println(a);
//         //this will give the address of the int array
//         char [] ch={'A','B','C'};
//         System.out.println(ch);
//         //this will print the character array elements not the address
//         //code of character array is different in the println and print, printstram class for the character array
//     }
// }



// public class TwoDArray {
//     public static void main(String [] args){
//         int [] a={1,2,3,4,5,8,7};
//         // System.out.println(a[-1]);//runtime error
//         Arrays.sort(a);//soritng array with the sort function
//         System.out.println(Arrays.toString(a));
//     }
// }



// public class TwoDArray {
//     public static void main(String [] args){
//         int [] a={1,2,3};
//         int [] b={4,5};
//         b=a;
//         System.out.println(a);//same address will be printed 
//         System.out.println(b);//same address will be printed

//     }
// }


//Output will be false because the elements of the arrays on the same index are not equal
// public class TwoDArray {
//     public static void main(String [] args){
//         int [] a={1,2,3};
//         int [] b={2,3,1};
//         System.out.println(Arrays.equals(a, b));
//     }
// }


//to find the sum of the diagonal elements
public class TwoDArray {
    public static int diagonal(int [][] arr,int n,int m){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j)
                    sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions Row and Column:- ");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter the array elements:- ");

        //standard way to take the input from the user
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         arr[i][j]=sc.nextInt();
        //     }
        // }

        //more understandable way to take input from the user
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Sum of the diagonal elements is:- "+diagonal(arr, rows, cols));


        //below is the code to find the max of each column in a 2D array
        //use j for the columns and i for the rows
        int [] colsmax = new int[cols];
        for (int j = 0; j < cols; j++) {
            int max=Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            colsmax[j]=max;
        }
        System.out.println("Maximum of the columns are:- "+ Arrays.toString(colsmax));
   
   
   
    }
}