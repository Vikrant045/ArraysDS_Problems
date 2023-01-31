public class ReverseArray {
    public static void reverse(int rev[]){
        int start = 0;
        int end = rev.length-1;

        while(start<=end){
            int temp = rev[start];
            rev[start]=rev[end];
            rev[end] = temp;
            start++;
            end--;
        }
       
    }
    public static void main(String args[]){


        int rev[]= {12,10,656,0,5,40};
        for(int i=0;i<rev.length;i++){
            System.out.print(" "+rev[i]);
        }
        System.out.println();
        reverse(rev);
        for(int i=0;i<rev.length;i++){
            System.out.print(" "+rev[i]);
        }
    }
    
}
