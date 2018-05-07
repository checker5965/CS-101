class Animation
{
    public static void main(String args[])
    {
        while(true)
        {
        StdDraw.enableDoubleBuffering();    
        StdAudio.play("thankyou.wav");
        for(int i=1;i<=60;i++)
        {
            StdDraw.clear();
            StdDraw.picture(0.5,0.5,"frame ("+i+").jpg");
            StdDraw.show();
            StdDraw.pause(30);
        }
        }
    }
}