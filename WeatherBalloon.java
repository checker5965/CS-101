class WeatherBalloon
{
    public static void main(String args[])
    {
        // iterate over time
        for(int t = 0; t<=48; t++)
        {
            // calculate height
           double h = (0.12*(Math.pow(t,4)))+(12.0*(Math.pow(t,3)))-(380.0*(Math.pow(t,2)))+(4100.0*t)+220;
           // print height
           System.out.println("Height at t= "+t+" is: "+h);
        }
    }
}