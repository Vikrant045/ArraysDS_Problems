public class RainWaterAgain {
    public static int water(int Bar[]) {

        int maxLeft[]= new int [Bar.length];
        int maxRight[]= new int [Bar.length];
        int max = 0;
        int minHeight[]= new int [Bar.length];


        for(int i=0;i<Bar.length;i++){
           
          if(i==0){
            maxLeft[i]=Bar[i];

          }
          else{
            maxLeft[i]= Math.max(maxLeft[i-1], Bar[i]);
          }
            


        }
        for(int i=Bar.length-1;i>=0;i--){
            if(i==Bar.length-1){
                maxRight[i]=Bar[i];
            }
            else{
                maxRight[i]= Math.max(maxRight[i+1], Bar[i]);
            }
        }
        for(int i=0;i<Bar.length;i++){
            minHeight[i]=Math.min(maxLeft[i], maxRight[i]);
            
        }
        int TotalTrapWater=0;
//int maxRight[]= new int [Bar.length];
      for(int i=0;i<Bar.length;i++)
      {
       int Water = minHeight[i]-Bar[i];

        TotalTrapWater+=Water;

      }

        return TotalTrapWater;
    }
    public static void main(String args[]) {

        int Bar[]= {1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(water(Bar));
        
    }
    
}
