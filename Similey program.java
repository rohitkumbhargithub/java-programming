import java.awt.*;
import java.applet.*;
public class similey extends Applet{
    public void paint(Graphics g){
        Font f=new Font("Helvetica",Font.BOLD,20);
        g.setFont();
        g.drawString("keep similing",50,30);
        g.drawoval(60,60,200,200);
        g.filloval(90,120,50,30);
        g.filloval(190,120,50,30);
        g.drawLine(165.125,165.175);
        g.drawArc(110,130,95,95,0,-180);
    }
}