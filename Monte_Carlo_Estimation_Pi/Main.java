

package piestimation_montecarlo;

/**
 *
 * @author Ayush
 */
import java.util.Random;
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int epochs=10000;
     int i=1;
     int r=1;
     double incir=0;
    double gen=0;
     double pi_e=0;
     double dist=0.0;
     while(i<epochs)
     {
     double x=Math.random();
     double y=Math.random();
     dist=(x*x)+y*y;
     if(dist<=1)
         incir+=1;
     gen++;
     pi_e=(4*incir)/gen;
     System.out.println("Iteration "+i+" :"+x+" "+y+" "+pi_e);
     i+=1;


    }

}}
