public class ArrayFrequency {

    public static void main(String args[]){
int lar = Integer.MIN_VALUE;
        int arr[] = {4,4,12,6,9,20,20,9,12,4,6,4};
        for(int i=0;i<arr.length;i++){
            lar = Math.max(lar, arr[i]);
            System.out.print(" "+arr[i]);
        }
        System.out.println();
int ArrayFrequency []= new int [lar+1];
        for(int i=0;i<arr.length;i++){
ArrayFrequency[arr[i]]++;
System.out.print(" "+ArrayFrequency[i]);

        }
      
        for(int i=0;i<lar+1;i++){

        }
    }
    
}
