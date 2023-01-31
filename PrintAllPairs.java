public class PrintAllPairs {

    public static void Pairs(int pair[]) {

        for(int i=0;i<pair.length;i++){
            for(int j =i+1;j<pair.length;j++){
                System.out.print(" ["+pair[i]+","+pair[j]+"]");
            }
        }
        
    }
    public static void main(String args[]) {

        int pair[] ={4,5,32,52};
        Pairs(pair);
        
    }
    
}
