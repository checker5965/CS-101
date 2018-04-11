class Pattern
{
    public static void main(String args[])
    {
        // input
        int n = Integer.parseInt(args[0]);
        // rows
        for(int i = 1; i<=n; i++)
        {
            // fill rows
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
                // spaces and reverse pattern
                if(j==i)
                {
                    for(int k=0;k<(n*2-i*2);k++)
                    {
                        System.out.print(" ");
                    }
                    for(int x=i; x>0;x--)
                    {
                        System.out.print(x);
                    }
                }
            }
            // change row
            System.out.println();
        }
    }
}