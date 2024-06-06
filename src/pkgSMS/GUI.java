/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgSMS;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author simte
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
        getJButton("Log in", 400, 500, 30, 150, panel);
        getJButton("Register", 400, 450, 30, 150, panel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        return frame;
    }
    
    //
    public JButton getJButton(String text, int x, int y, int length, int width, JPanel panel)
    {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, length);
        panel.add(button);
        return button;
    }
    
    // 
    public void registerButtonClicked(ActionEvent e, JPanel panel)
    {
        JFrame frameRegister = new JFrame();
        frameRegister.add(panel);
        frameRegister.setVisible(true);
        frameRegister.show();
    }
    
    
}
