import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
 
/* <applet code="HouseApplet.class" width="400" height="400"></applet> */ 
 
public class HouseApplet extends Applet implements MouseListener  
{ 
    private Color doorColor = Color.BLUE;  
    public void init()  
    {      addMouseListener(this);      } 
    public void paint(Graphics g)  
    { 
        // Draw the house body 
        g.setColor(Color.YELLOW); 
        g.fillRect(100, 150, 200, 150); 
 
        g.setColor(Color.RED); 
        int[] xPoints = {100, 200, 300}; 
        int[] yPoints = {150, 50, 150};  
        g.fillPolygon(xPoints, yPoints, 3); 
 
        
        g.setColor(Color.WHITE); 
        g.fillRect(120, 170, 40, 40); 
        g.fillRect(240, 170, 40, 40); 
     
        g.setColor(doorColor); 
        g.fillRect(180, 220, 40, 80); 
        
        g.setColor(Color.BLACK); 
        g.fillOval(215, 260, 5, 5); 
    } 
    public void mouseClicked(MouseEvent e)  
     { 
        doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE; 
        repaint();  
    } 
   
    public void mousePressed(MouseEvent e) { } 
    public void mouseReleased(MouseEvent e) { } 
    public void mouseEntered(MouseEvent e) { } 
    public void mouseExited(MouseEvent e) { } 
} 
