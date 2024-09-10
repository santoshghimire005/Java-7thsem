package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class EventHandling implements ActionListener {
    JLabel usernamelbl, passwordlbl;
    JTextField usernametxt;
    JPasswordField passwordtxt;
    JButton loginbtn, cancelbtn, resetbtn;
    JFrame frame;
    public EventHandling(){
         frame = new JFrame("Login form");  
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
            loginbtn.setBounds(30,70,100,20);
            loginbtn.addActionListener(this);
            frame.add(loginbtn);

            //cancel
            cancelbtn= new JButton("cancel");
            cancelbtn.setBounds(140,70,100,20);
            cancelbtn.addActionListener(this);
            frame.add(cancelbtn);

            //reset
            resetbtn= new JButton("reset");
            resetbtn.setBounds(250,70,100,20);
            resetbtn.addActionListener(this);
            frame.add(resetbtn);



            frame.setVisible(true);
          }

    
    public static void main(String[] args) {
        new EventHandling();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginbtn){
            JOptionPane.showMessageDialog(null, "Login succesful!!");

        }
        else if(e.getSource()==cancelbtn){
            if (JOptionPane.showConfirmDialog(null, "Do you want to cancel?")==0)
            {
                // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                System.out.println("hello test");
            }
            
        
        else if(e.getSource()==resetbtn){
            usernametxt.setText("");
            passwordtxt.setText("");

            
        }
    }
}
}
