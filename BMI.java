public class BMI
{
    public static void main(String args[])
    {
        // input weight and height
        Double w = Double.parseDouble(args[0]);
        Double h = Double.parseDouble(args[1]);
        // calculate bmi
        Double bmi = w/(Math.pow(h,2));
        // print bmi
        System.out.println("Your BMI is "+bmi);
        boolean health=true;
        // check if person is unhealthy
        if (bmi<18.5||bmi>=25)
            health=false;
        // print health
        System.out.println("Are you healthy (true or false): "+health);
    }
}
