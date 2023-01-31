import java.util.*;
public class ArrayAsMethodArgument {

    public static void Names(String arr[]) {
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<arr.length;i++){
            System.out.println(" Enter Students Name");
            arr[i]= sc.nextLine();
        }

        
    }
    public static void main(String args[]) {

        String names [] = new String[5];


        Names(names);
        for(int i =0;i<names.length;i++){
          System.out.print(" "+names[i]);
        }
        
    }
    
}
