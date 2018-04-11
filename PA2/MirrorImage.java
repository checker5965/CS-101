class MirrorImage
{
    public static void main(String args[])
    {
        int r = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int arr[][]=new int[r][c];
        for (int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                arr[i][j] = (int)(Math.random()*9)+1;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n\nPrinting Mirror Image\n");
        for (int x=0; x<r; x++)
        {
            for (int y=c-1;y!=-1;y--)
                System.out.print(arr[x][y]+" ");
            System.out.println();
        }
    }
}