class SortFourNumbers 
{
    public static void main(String args[])
    {
        // input numbers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        // store highest of three numbers
        int h1 = Math.max(a,b);
        h1 = Math.max(h1,c);
        // store lowest of three numbers
        int l1 = Math.min(a,b);
        l1 = Math.min(l1,c);
        // store middle value
        int m1 = a+b+c-h1-l1;
        // store highesr of four numbers
        int h = Math.max(a,b);
        h = Math.max(h,c);
        h = Math.max(h,d);
        // store lowest of four numbers
        int l = Math.min(a,b);
        l = Math.min(l,c);
        l = Math.min(l,d);
        // calculate second middle value
        int m2 = a+b+c+d-h-l-m1;
        // higher mid value
        int mh = Math.max(m1,m2);
        // lower mid value
        int ml = Math.min(m1,m2);
        System.out.println(h+" "+mh+" "+ml+" "+l);
    }
}