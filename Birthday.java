public class Birthday
{
    public static void main(String args[])
    {
        int days=Integer.parseInt(args[0]);
        int people =0;
        int arr[]=new int[365];

        for(int i=0;i<days;i++)
        {
            people++;
            int day=(int)(Math.random()*365+1);
            if(arr[day-1]!=2)
            {
                arr[day-1]++;
            }
            else
            {
                System.out.println(people);
            }
        }
    }
}