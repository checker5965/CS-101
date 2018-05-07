class CheckReverse
{
    static boolean isReverse(int a1[], int a2[])
    {
        if(a1.length!=a2.length)
            return false;
        else
        {
            int l=a1.length;
            for(int i=0,j=l-1;i<l;i++,j--)
            {
                if(a1[i]!=a2[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int[] a={5, 2, 3, 1};
        int[] b={1, 3, 2, 8};
        int l1=a.length;
        int l2=b.length;
        System.out.print("Array 1: ");
        for(int i=0;i<l1;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.print("Array 2: ");
        for(int i=0;i<l2;i++)
            System.out.print(b[i]+" ");
        System.out.println();
        boolean flag= isReverse(a,b);
        System.out.println("Are the arrays (Array 1 and Array 2) reverse of each other? "+flag);
        int[] c={2, 3, 1};
        int[] d={1, 3, 2, 8};
        int l3=c.length;
        int l4=d.length;
        System.out.print("Array 1: ");
        for(int i=0;i<l3;i++)
            System.out.print(c[i]+" ");
        System.out.println();
        System.out.print("Array 2: ");
        for(int i=0;i<l4;i++)
            System.out.print(d[i]+" ");
        System.out.println();
        flag= isReverse(c,d);
        System.out.println("Are the arrays (Array 1 and Array 2) reverse of each other? "+flag);
        int[] e={5, 2, 3, 1};
        int[] f={1, 3, 2, 5};
        int l5=e.length;
        int l6=f.length;
        System.out.print("Array 1: ");
        for(int i=0;i<l5;i++)
            System.out.print(e[i]+" ");
        System.out.println();
        System.out.print("Array 2: ");
        for(int i=0;i<l6;i++)
            System.out.print(f[i]+" ");
        System.out.println();
        flag= isReverse(e,f);
        System.out.println("Are the arrays (Array 1 and Array 2) reverse of each other? "+flag);
    }
}