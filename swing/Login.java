package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {
    JLabel usernamelbl, passwordlbl;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton loginbtn, cancelbtn, resetbtn;
    public Login(){
        JFrame frame = new JFrame("Login form");  
            // frame.setTitle("Login form")
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,200);
            frame.setLayout(null);

            //label

            usernamelbl = new JLabel("User Name");
            usernamelbl.setBounds(10,10, 100, 25);
            frame.add(usernamelbl);

            passwordlbl = new JLabel("Password");
            passwordlbl.setBounds(10,40, 100, 25);
            frame.add(passwordlbl);

            usernametxt = new JTextField();
            usernametxt.setBounds(115, 10, 100, 25);
            frame.add(usernametxt);

            passwordtxt = new JPasswordField();
            passwordtxt.setBounds(115, 40, 100, 25);
            frame.add(passwordtxt);

            //Button
            loginbtn= new JButton("Login");
            loginbtn.setBounds(30,70,50,20);
            frame.add(loginbtn);

            //cancel
            cancelbtn= new JButton("cancel");
            cancelbtn.setBounds(90,70,50,20);
            frame.add(cancelbtn);

            //reset
            resetbtn= new JButton("reset");
            resetbtn.setBounds(150,70,50,20);
            frame.add(resetbtn);



            frame.setVisible(true);
          }
    
    public static void main(String[] args) {
        new Login();
    }
}
