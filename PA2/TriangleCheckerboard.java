class TriangleCheckerboard
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
        StdDraw.setXscale(0,n);
        StdDraw.setYscale(0,n);
        int i=0;
        int l=0;
        while(i<n)
        {
            int j=0;
            while(j<n)
            {
                if(l%2==0)
                    StdDraw.setPenColor(StdDraw.BLACK);
                else
                    StdDraw.setPenColor(StdDraw.RED);
                StdDraw.line(0.0+j, 0.0+i, 1.0+j, 0.0+i);
                StdDraw.line(1.0+j, 0.0+i, 0.5+j, 1+i);
                StdDraw.line(0.5+j, 1+i, 0.0+j, 0.0+i);
                j++;
                l++;
            }
            i++;
            if((n%2)==0)
            {
                l++;
            }
        }
    }
}