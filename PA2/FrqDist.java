class FrqDist
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        System.out.println("The numbers generated are:");
        int arr[] = new int[n];
        double sum=0.0;
        double mean;
        for(int i=0;i<n;i++)
        {
            arr[i] = (int)(Math.random()*10)+1;
            System.out.print(arr[i]+" ");
            sum+=arr[i];
        }
        mean=sum/n;
        System.out.println("\nMean of the generated numbers is: "+mean+"\nNumber\tFrequency");
        for(int x=1;x<11;x++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[j]==x)
                    c++;
            }
            System.out.println("     "+x+"\t"+c);
        }
    }
}