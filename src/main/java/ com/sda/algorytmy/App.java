package  com.sda.algorytmy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a ={3,6,7,34,55};
        int wyniki= a[0];
        int maximum = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i]>wyniki){
                wyniki = a[i];
            }
        }


        for(int i=1;i<a.length;i++){
            if(a[i]<maximum){
                wyniki = a[i];
            }
        }



        System.out.println("element minimalny:" + maximum);
        System.out.println("element maxymalny:" + wyniki);
    }
}
