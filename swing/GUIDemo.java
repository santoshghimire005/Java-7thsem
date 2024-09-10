package swing;

import javax.swing.JFrame;

public class GUIDemo {
    public GUIDemo(){
          JFrame frame = new JFrame("GUI Demo");  
            // frame.setTitle("GUI Demo")
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,200);
            frame.setVisible(true);
          }
    
    public static void main(String[] args) {
        new GUIDemo();
        
    }
}


    
    

