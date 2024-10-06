import Calculator.*;

public class Demo
{
    public static void main(String[] a) 
    {
       VeryAdvCal obj = new VeryAdvCal();
       int r1 = obj.add(2, 3);
       int r2 = obj.sub(2, 3);
       int r3 = obj.mul(2, 3);
       double r4 = obj.div(7, 3);
       double r5 = obj.power(2, 3);
       
       System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}