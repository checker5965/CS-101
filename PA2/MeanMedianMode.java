class MeanMedianMode
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        StdOut.println("Enter Integer numbers in sorted order");
        int arr[]=new int[n];
        double sum=0;
        double med;
        for(int i=0;i<n;i++)
        {
            arr[i]=StdIn.readInt();
            sum+=arr[i];
        }
        if(n%2==0)
            med=(arr[n/2]+arr[(n/2)-1])/2.0;
        else 
            med=arr[n/2];
        int c=1, ind=0;
        int h=1;
        for(int j=1;j<n;j++)
        {
            if(arr[j-1]==arr[j])
                c++;
            else 
            {
                if(c>h)
                    ind=j-1;
                    h=c;
                    c=1;
            }
        }
        StdOut.println("Mean = "+sum/n+"\nMedian = "+med+"\nMode = "+arr[ind]+"\n");
    }
}