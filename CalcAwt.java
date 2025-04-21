import java.awt.*;
import java.awt.event.*;

class CalcAwt extends WindowAdapter implements ActionListener {
    Frame f;
    TextField display;
    Button[] digits = new Button[10];
    Button bAdd, bSub, bMul, bDiv, bCalc, bDot;
    double num1 = 0, num2 = 0, result = 0;
    int operation = 0; // 1: +, 2: -, 3: *, 4: /

    CalcAwt() {
        f = new Frame("MY CALCULATOR");
        f.setLayout(null);
        f.setSize(360, 400);

        // Display field
        display = new TextField();
        display.setBounds(50, 50, 250, 50);
        display.setBackground(Color.LIGHT_GRAY);
        display.setEditable(false);
        f.add(display);

        // Digit buttons 0–9
        int x = 50, y = 120;
        for (int i = 1; i <= 9; i++) {
            digits[i] = new Button(String.valueOf(i));
            digits[i].setBounds(x, y, 50, 50);
            digits[i].addActionListener(this);
            f.add(digits[i]);

            x += 70;
            if (i % 3 == 0) {
                x = 50;
                y += 60;
            }
        }

        // 0 button
        digits[0] = new Button("0");
        digits[0].setBounds(50, 300, 50, 50);
        digits[0].addActionListener(this);
        f.add(digits[0]);

        // Decimal point
        bDot = new Button(".");
        bDot.setBounds(120, 300, 50, 50);
        bDot.addActionListener(this);
        f.add(bDot);

        // Equal button
        bCalc = new Button("=");
        bCalc.setBounds(190, 300, 50, 50);
        bCalc.addActionListener(this);
        f.add(bCalc);

        // Operation buttons
        bDiv = new Button("/");
        bDiv.setBounds(260, 120, 50, 50);
        bDiv.addActionListener(this);
        f.add(bDiv);

        bMul = new Button("*");
        bMul.setBounds(260, 180, 50, 50);
        bMul.addActionListener(this);
        f.add(bMul);

        bSub = new Button("-");
        bSub.setBounds(260, 240, 50, 50);
        bSub.addActionListener(this);
        f.add(bSub);

        bAdd = new Button("+");
        bAdd.setBounds(260, 300, 50, 50);
        bAdd.addActionListener(this);
        f.add(bAdd);

        // Close on window close
        f.addWindowListener(this);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        String current = display.getText();

        // Digit buttons
        for (int i = 0; i <= 9; i++) {
            if (e.getSource() == digits[i]) {
                display.setText(current + i);
                return;
            }
        }

        // Decimal
        if (e.getSource() == bDot) {
            if (!current.contains(".")) {
                display.setText(current + ".");
            }
            return;
        }

        // Operator buttons
        try {
            num1 = Double.parseDouble(display.getText());
        } catch (NumberFormatException ex) {
            display.setText("Invalid Format");
            return;
        }

        if (e.getSource() == bAdd) {
            operation = 1;
            display.setText("");
        } else if (e.getSource() == bSub) {
            operation = 2;
            display.setText("");
        } else if (e.getSource() == bMul) {
            operation = 3;
            display.setText("");
        } else if (e.getSource() == bDiv) {
            operation = 4;
            display.setText("");
        } else if (e.getSource() == bCalc) {
            try {
                num2 = Double.parseDouble(display.getText());
            } catch (Exception ex) {
                display.setText("Enter Number First");
                return;
            }

            switch (operation) {
                case 1: result = num1 + num2; break;
                case 2: result = num1 - num2; break;
                case 3: result = num1 * num2; break;
                case 4:
                    if (num2 == 0) {
                        display.setText("Cannot divide by 0");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default: return;
            }

            display.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new CalcAwt();
    }
}
