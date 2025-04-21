import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
/* <applet code="SMark.class" width="400" height="400"></applet> */ 
public class SMark extends Applet implements ActionListener  
{ 
    TextField t1, t2, t3, t4; 
    Button b; 
    Label l1, l2, l3, l4; 
    double percentage = 0.0;  
 
    public void init()  
    { 
        l1 = new Label("Mark1:");     t1 = new TextField(5); 
        l2 = new Label("Mark2:");     t2 = new TextField(5); 
        l3 = new Label("Mark3:");     t3 = new TextField(5); 
 
        l4 = new Label("Percentage:"); t4 = new TextField(5); 
        t4.setEditable(false); 
 
        b = new Button("Calculate"); 
        b.addActionListener(this); 
 
        setLayout(null); 
        l1.setBounds(50, 40, 100, 20);              add(l1);  
        t1.setBounds(150, 40, 100, 20);    add(t1); 
        l2.setBounds(50, 80, 100, 20);              add(l2); 
        t2.setBounds(150, 80, 100, 20);    add(t2); 
        l3.setBounds(50, 120, 100, 20);            add(l3); 
        t3.setBounds(150, 120, 100, 20);          add(t3); 
        l4.setBounds(50, 160, 100, 20);            add(l4); 
        t4.setBounds(150, 160, 100, 20);          add(t4); 
        b.setBounds(100, 200, 80, 30);             add(b);    
    } 
    public void actionPerformed(ActionEvent e)  
    { 
        try  
        { 
            int x = Integer.parseInt(t1.getText()); 
            int y = Integer.parseInt(t2.getText()); 
            int z = Integer.parseInt(t3.getText()); 
            percentage = ((x + y + z)*100 / 300);   
            t4.setText(String.format("%.2f", percentage)); 
            repaint();                    
         }  
 
 
        catch (NumberFormatException ex)  
        { 
            t4.setText("Error"); 
        } 
    } 
    
    public void paint(Graphics g)  
    { 
        super.paint(g);    
        g.setColor(Color.YELLOW); 
        g.fillOval(150, 250, 100, 100); 
        g.setColor(Color.BLACK); 
        g.fillOval(170, 275, 10, 10); 
        g.fillOval(210, 275, 10, 10);         if (percentage > 50)  
        { 
            g.drawArc(175, 300, 50, 20, 180, 180); 
        }  
        else  
        { 
            g.drawArc(175, 310, 50, 20, 0, 180);         } 
    } 
} 