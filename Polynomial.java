public class Polynomial
{
    public static void main(String args[])
    {
        // input values
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        // calculate expression
        double exp = Math.pow(b,2.0)*Math.pow(c,2.0)-(4*Math.pow(c,3.0))-(4*Math.pow(b,3)*d)-(27*Math.pow(d,2))+(18*b*c*d);
        // print expression
        System.out.println((int)exp);
    }
}
