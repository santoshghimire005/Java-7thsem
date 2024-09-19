package swing;

import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu.Separator;


public class MenuDemo extends JFrame {
    JMenu filemenu, editmenu, viewmenu, toolbarmenu;
    JMenuItem openmitem, newmitem, savemitem, undomitem, redomitem, debugitem ;
    public MenuDemo(){
        JMenuBar  bar= new JMenuBar();
        setSize(500,500);
        setTitle("Menu Example Demo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setLayout(null);

        filemenu = new JMenu("File");
        editmenu = new JMenu("Edit");
        viewmenu = new JMenu("View");
        toolbarmenu= new JMenu("Toolbar");

        // ImageIcon= new ImageIcon()

        openmitem= new JMenuItem("open");
        
        newmitem= new JMenuItem("new");
        savemitem= new JMenuItem("save");
        undomitem= new JMenuItem("undo");
        redomitem= new JMenuItem("redo");
        debugitem= new JMenuItem("debug");

        setJMenuBar(bar);

        bar.add(filemenu);
        bar.add(editmenu);
        bar.add(viewmenu);
        viewmenu.add(toolbarmenu);

        filemenu.add(openmitem);
        filemenu.add(newmitem);
        filemenu.add(new Separator());
        filemenu.add(savemitem);

        editmenu.add(undomitem);
        editmenu.add(redomitem);

        toolbarmenu.add(debugitem);


        setVisible(true);



    }
    public static void main(String[] args) {
        
        new MenuDemo();
    }
    
}
