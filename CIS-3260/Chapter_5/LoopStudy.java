package Chapter_5;

public class LoopStudy {
    public static void main (String[] args) {
        int i;
        double total_sum1=0.0;
        double total_sum2=1.0;
        for (i = 1; i<200; i++) { 
 	      total_sum1+= 1.0/i;	  
 	      total_sum2*= 1.0/i;	
 	  System.out.println("i is  " + i);
 	  System.out.println("total_sum1 is  " + total_sum1);
 	  System.out.println("total_sum2 is  " + total_sum2);
        }
       System.out.println("The output one is  " + total_sum1);
       System.out.println("The output two is  " + total_sum2);
}
}
