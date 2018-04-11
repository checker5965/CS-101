import java.awt.Font;
class Banner
{
    public static void main(String args[])
    {
        String name = args[0];
        String dir = args[1];

        Font font = new Font("Arial", Font.BOLD, 60);
        StdDraw.setFont(font);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.enableDoubleBuffering();

        for(double i=0;true;i+=0.01)
        {
            StdDraw.clear(StdDraw.BLACK);
            if(dir.equals("LEFT"))
            {
                StdDraw.text(i%1.0,0.5,name);
                StdDraw.text((i % 1.0) - 1.0, 0.5, name);
                StdDraw.text((i % 1.0) + 1.0, 0.5, name);
                StdDraw.pause(100);
                StdDraw.show();
            }
            else if(dir.equals("RIGHT"))
            {
                StdDraw.text(((1.0-i)%1.0),0.5,name);
                StdDraw.text(((1.0-i) % 1.0) - 1.0, 0.5, name);
                StdDraw.text(((1.0-i) % 1.0) + 1.0, 0.5, name);
                StdDraw.pause(100);
                StdDraw.show();
            }
            else if(dir.equals("TOP"))
            {
                StdDraw.text(0.5,(1.0-i)%1.0,name);
                StdDraw.text(0.5, ((1.0-i) % 1.0) - 1.0, name);
                StdDraw.text(0.5, ((1.0-i) % 1.0) + 1.0, name);
                StdDraw.pause(100);
                StdDraw.show();
            }
            else if(dir.equals("BOTTOM"))
            {
                StdDraw.text(0.5,i%1.0,name);
                StdDraw.text(0.5, (i % 1.0) - 1.0, name);
                StdDraw.text(0.5, (i % 1.0) + 1.0, name);
                StdDraw.pause(100);
                StdDraw.show();
            }
        }
    }
}