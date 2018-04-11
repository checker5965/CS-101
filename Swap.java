public class Swap
{
    public static void main(String args[])
    {
        // input arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // before swap
        System.out.println("Before Swapping\na = "+a+", b = "+b);
        // swapping
        a = a + b;
        b = a - b;
        a = a - b;
        // after swap
        System.out.println("After Swapping\na = "+a+", b = "+b);
    }
}