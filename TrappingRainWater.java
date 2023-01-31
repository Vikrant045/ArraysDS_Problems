public class TrappingRainWater{

    public static int water(int bar[]){
        int leftMaxBar []=new int [bar.length];
        int RightMaxBar []=new int [bar.length];
        int trapWater []=new int [bar.length];


        int last = bar.length-1;

        for(int i=0;i<bar.length;i++){
            if(i==0){
                leftMaxBar[i]=bar[i];
            }
            else{
            leftMaxBar[i] = Math.max(leftMaxBar[i-1], bar[i]);
            }
          //  System.out.print(" "+leftMaxBar[i]);
        }
      //  System.out.println();
        for(int i=last;i>=0;i--){
            if(i==last){
                RightMaxBar[i]=bar[i];
            }
            else{
            RightMaxBar[i] = Math.max(bar[i],RightMaxBar[i+1]);}
         //   System.out.print(" "+RightMaxBar[i]);
           // leftMaxBar[i] = Math.max(leftMaxBar[i-1], bar[i])
        }
        int totalTrapWater =0;
        System.out.println(" Trap Water");
        for(int i =0;i<bar.length;i++){
            int min = Math.min(leftMaxBar[i], RightMaxBar[i]);
            trapWater[i]= min-bar[i];
            System.out.print(" "+trapWater[i]);
            totalTrapWater +=trapWater[i];

        }
        System.out.println();
        return totalTrapWater;


    }
    public static void main(String args[]){
        int bar[]={4,2,0,6,3,2,5};
        System.out.println(" given bars");
        for(int i =0;i<bar.length;i++){
         
            System.out.print(" "+bar[i]);

        }
        System.out.println();


       System.out.println(water(bar)) ;

    }
}