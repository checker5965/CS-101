class Series
{
    static double fact(int n)
    {
        double fac=1.0;
        for(int i=n;i>0;i--)
        {
            fac*=i;
        }
        return fac;
    }
    static double element(int n)
    {
        double ele = (n/fact(n));
        return ele;
    }
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
        double sum=0;
        for(int i=1;i<=n;i++)
            sum+=element(i);
        System.out.println(sum);
    }
}