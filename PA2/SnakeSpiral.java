class SnakeSpiral
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        int arr[][]= new int[n][n];
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=c;
                c++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int x=0;x<n;x++)
        {
            if(x%2==0)
                for(int y=0;y<n;y++)
                {
                    System.out.println(arr[x][y]);
                }
            else
                for(int y=n-1;y!=-1;y--)
                {
                    System.out.println(arr[x][y]);
                }
        }
    }
}