class necker
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n);
        double x = 0.0;
        double y = n-0.1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2*(n-i); j++)
            {
                if(j%2!=0)
                    StdDraw.line(x,y,x+=0.5,y-=0.1);
                else
                {
                    StdDraw.line(x,y,x,y-0.7);
                    StdDraw.line(x,y-0.7,x+0.5,y-0.8);
                    StdDraw.line(x+0.5,y-0.8,x+1,y-0.7);
                    StdDraw.line(x,y,x+=0.5,y+=0.1);
                }
            }
            StdDraw.line(x,y,x,y-0.7);
            StdDraw.line(x,y,x+0.5,y+0.1);
            y-=0.8;
            x=n-x+0.5;
        }
        x=0.0;
        y=n-0.1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2*(n-i); j++)
            {
                if(j%2==0)
                {
                    StdDraw.line(x,y,x+=0.5,y-=0.1);
                    StdDraw.line(x,y,x,y-0.7);
                }
                else
                    StdDraw.line(x,y,x+=0.5,y+=0.1);
            }
            y-=0.8;
            x=n-x+0.5;
        } 
    }
}