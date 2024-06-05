package pkgSMS;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author tendai simbanegavi
 */
public class GUI 
{
    //
    public JPanel getJPanel()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        return panel;
    }
    
    //
    public JFrame getJFrame(String text, int length, int width, JPanel panel)
    {
        JFrame frame = new JFrame();
        frame.setSize(length, width);
        frame.add(panel);
        frame.setVisible(true);
        getJButton(panel);
        return frame;
    }
    
    //
    public JButton getJButton(JPanel panel)
    {
        JButton button = new JButton("log in");
        button.setBounds(400, 250, 150, 30);
        panel.add(button);
        return button;
    }
    public static void main(String[] args)
    {
        
    GUI gui = new GUI();
    
    gui.getJFrame("login", 1000, 700, gui.getJPanel());
    

        
    
    }
}

