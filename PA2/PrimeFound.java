class PrimeFound
{
    static boolean isPrime(int x)
    {
        for(int i=2;i<=(Math.sqrt(x));i++)
            if(x%i==0)
                return false;
        return true;
    }
    public static void main(String args[])
    {
        while(!StdIn.isEmpty())
        {
            int n= StdIn.readInt();
            if(isPrime(n))
            {
                StdOut.println("Prime number found, Program terminated");
                System.exit(0);
            }
        }
    }
}