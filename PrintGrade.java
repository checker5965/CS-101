public class PrintGrade
{
    public static void main(String args[])
    {
        // input marks
        double marks1 = Double.parseDouble(args[0]);
        double marks2 = Double.parseDouble(args[1]);
        double marks3 = Double.parseDouble(args[2]);
        // calculate average
        double average = (marks1+marks2+marks3)/3.0;
        // print average
        System.out.print("Average marks of Student: "+average+"\nYour Grade is ");
        // calculate and print grade
        if (average>=80)
            System.out.println("A");
        else if(average>=60)
            System.out.println("B");
        else if
        (average>=40)
            System.out.println("C");
        else
            System.out.println("D");
    }
}