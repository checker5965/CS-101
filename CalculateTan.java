class CalculateTan
{
    // Function to calculate factorial
    static double fact(double x)
    {
        double f=1.0;
        for(int i=1;i<=x;i++)
        {
            f = f*i;
        }
        return f;
    }
    
    public static void main(String args[])
    {
        // input
        double x = Double.parseDouble(args[0]);
        // 2pi and -2pi
        double h = 2.0*Math.PI;
        double l = -2.0*Math.PI;
        // conversion of higher values
        if(x>h)
            do
            {
                x = x-2*h;
            }while(x>h);
        // conversion of lower values
        if(x<l)
            do
            {
                x = x+2*h;
            }while(x<l);
        double np = 1.0;
        int s = 1;
        double sinx = 0;
        // calculate sine using taylor series
        for(int i=1; i<=10; i++)
        {
            if(i%2==0)
                s = -1;
            sinx = sinx + s*(Math.pow(x,np))/fact(np);
            np+=2;
            s=1; 
        }
        double cnp = 0.0;
        int cs = 1;
        double cosx = 0;
        // calculate cosine using taylor series
        for(int i=1; i<=10; i++)
        {
            if(i%2==0)
                cs = -1;
            cosx = cosx + cs*(Math.pow(x,cnp))/fact(cnp);
            cnp+=2;
            cs=1; 
        }
        System.out.println("Sin value is "+sinx+"\nCos value is "+cosx+"\nTan value is "+(sinx/cosx));
    } 
}