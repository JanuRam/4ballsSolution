import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int ScreenWidth = 680;
    public static final int ScreenHeight = 480;
    public static final int Diameter = 10;
    int x=0,y=0,z=0,a=0;


    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void setup() {
    }

    @Override
    public void settings() {
        super.settings();
        size(ScreenWidth,ScreenHeight);
    }

    @Override
    public void draw() {
        //makebackgroundwhite();
        drawCircle();

    }

    private void drawCircle() {
        ellipse(x,100, Diameter, Diameter);
        x++;
        ellipse(y,200, Diameter, Diameter);
        y+=2;
        ellipse(z,300, Diameter, Diameter);
        z+=3;
        ellipse(a,400, Diameter, Diameter);
        a+=4;
    }

    private void makebackgroundwhite() {
        background(255);
    }

}
