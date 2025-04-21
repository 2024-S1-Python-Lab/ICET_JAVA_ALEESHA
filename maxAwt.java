import java.awt.*;
import java.awt.event.*;

class maxAwt extends Frame {
    TextField t1, t2, t3, t4;
    Label la1, la2, la3, la4;
    Button b1, b2;

    maxAwt() {
        setTitle("Maximum of 3 Numbers");
        setLayout(null); // Important for absolute positioning

        // Labels and TextFields
        la1 = new Label("Enter 1st No:");
        la1.setBounds(50, 50, 100, 20);
        t1 = new TextField();
        t1.setBounds(160, 50, 145, 20);

        la2 = new Label("Enter 2nd No:");
        la2.setBounds(50, 90, 100, 20);
        t2 = new TextField();
        t2.setBounds(160, 90, 145, 20);

        la3 = new Label("Enter 3rd No:");
        la3.setBounds(50, 130, 100, 20);
        t3 = new TextField();
        t3.setBounds(160, 130, 145, 20);

        la4 = new Label("Result:");
        la4.setBounds(50, 170, 100, 20);
        t4 = new TextField();
        t4.setBounds(160, 170, 145, 20);
        t4.setEditable(false);

        // Buttons
        b1 = new Button("Max");
        b1.setBounds(90, 220, 70, 30);

        b2 = new Button("Exit");
        b2.setBounds(180, 220, 70, 30);

        // Add components to Frame
        add(la1); add(t1);
        add(la2); add(t2);
        add(la3); add(t3);
        add(la4); add(t4);
        add(b1); add(b2);

        setSize(400, 300);
        setVisible(true);

        // Max button action
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(t1.getText());
                    int b = Integer.parseInt(t2.getText());
                    int c = Integer.parseInt(t3.getText());
                    int max = Math.max(a, Math.max(b, c));
                    t4.setText("MAXIMUM = " + max);
                } catch (NumberFormatException ex) {
                    t4.setText("Invalid Input!");
                }
            }
        });

        // Exit button action
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new maxAwt();
    }
}
