public class PrintAllSubArrays {

    public static void main(String args[]) {

        int arr[]= {1,2,3,4};
int t =0;
        for(int i =0;i<arr.length;i++){
            System.out.println();

            for(int j =i;j<arr.length;j++){
                System.out.print("[");

                for(int k =i;k<=j;k++){
                    System.out.print(" "+arr[k]);
                }
                t++;
                System.out.print("]");
                System.out.println();



            }
        }
        System.out.println("Total numbers of sub Arrays "+t);
        
    }
    
}
