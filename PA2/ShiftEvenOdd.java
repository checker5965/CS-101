class ShiftEvenOdd
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        System.out.println("Initial Array:");
        for(int i=0;i<10;i++)
        {
            arr[i]=(int)(Math.random()*100)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nArray after shifting even element to left and odd element to right:");
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2==0)
                continue;
            else
            {
                for(int j=i;j<10;j++)
                {
                    if(arr[j]%2==0)
                    {
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }
        for(int k=0;k<10;k++)
        {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
}