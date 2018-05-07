class CircularTile
{   
    static void drawRedCirc(int n, double c2)
    {
        StdDraw.setPenColor(StdDraw.RED);
        for(double i=1.0/(2*n);i<n;i+=(1.0/n))
        {
            StdDraw.circle(i,c2,1.0/(2*n));
        }
    }
    static void drawBlkCirc(int n, double c2, double start)
    {
        StdDraw.setPenColor(StdDraw.BLACK);
        for(double i=1.0/(2*n)+start;i<n;i+=2*(1.0/n))
        {
            StdDraw.filledCircle(i,c2,1.0/(2*n));
        }
    }
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        double start=0.0; int c=0;
        for(double j=1.0/(2*n);j<n;j+=(1.0/n))
            drawRedCirc(n,j);
        for(double j=1.0/(2*n);j<n;j+=(1.0/n))
        {
            if(c%2==0)
                start=0.0;
            else
                start=2*1.0/(2*n);
            drawBlkCirc(n,j,start);
            c++;
        }
    }
}