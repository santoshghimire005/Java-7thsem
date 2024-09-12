package swing;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;

public class Calculator implements ActionListener {

    JLabel fnlbl, snlbl, resultlbl, result;
    JTextField fntxt, sntxt;
    JButton addbtn, subbtn, divbtn, mulbtn;
    JFrame f;

    public Calculator() {
        f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400);
        f.setLayout(new GridLayout(0, 2, 10, 10));

        fnlbl = new JLabel("First number");
        f.add(fnlbl);

        fntxt = new JTextField();
        f.add(fntxt);

        snlbl = new JLabel("second number");
        f.add(snlbl);

        sntxt = new JTextField();
        f.add(sntxt);

        resultlbl = new JLabel("Result");
        f.add(resultlbl);

        result = new JLabel();
        result.setFont(new Font("ALGERIAN", Font.BOLD, 20));
        result.setForeground(Color.RED);
        f.add(result);

        addbtn = new JButton("Addition");
        f.add(addbtn);
        addbtn.addActionListener(this);

        subbtn = new JButton("subtract");
        f.add(subbtn);
        subbtn.addActionListener(this);

        mulbtn = new JButton("multiply");
        f.add(mulbtn);
        mulbtn.addActionListener(this);

        divbtn = new JButton("divide");
        f.add(divbtn);
        divbtn.addActionListener(this);

        f.setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int x = Integer.parseInt(fntxt.getText().trim());
        int y = Integer.parseInt(sntxt.getText().trim());
        float result = 0;

        if (ae.getSource() == addbtn) {
            result = x + y;

        }
        if (ae.getSource() == subbtn) {
            result = x - y;

        }
        if (ae.getSource() == divbtn) {
            result = (float) x / y;

        }
        if (ae.getSource() == mulbtn) {
            result = x * y;

        }
        this.result.setText(Float.toString(result));
    }

}
