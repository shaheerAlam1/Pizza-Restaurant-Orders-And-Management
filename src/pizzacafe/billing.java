/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacafe;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class billing {
    static JLabel l2;
    static JTextField tf;
    static JTextArea ja; 
    static JFrame f;
    static JPanel p;
    public billing(){
        f=new JFrame("PIZZACAFE");
        f.setSize(500,500);
        f.setResizable(false);
         f.setLocation(700, 300);
        p=new JPanel(new GridBagLayout ());
        p.setBackground(new Color(179, 207, 207));
        l2=new JLabel("BILLING");
        l2.setFont(new Font("ZapfDingbats", Font.BOLD, 22));
        l2.setForeground(Color.BLACK);
        tf=new JTextField(15);tf.setEditable(false);
        ja=new JTextArea(20,20);ja.setEditable(false);
        ja.setBackground(new Color(207, 179, 179));
        GridBagConstraints c1=new GridBagConstraints();
        c1.insets=new Insets(3,3,3,3);
        c1.ipady=15;
        c1.gridx=0; c1.gridy=0; p.add(l2,c1);
        c1.gridy=1; p.add(ja,c1);
        c1.gridy=2; p.add(tf,c1);
        f.add(p);
        f.setVisible(true);
        
    }
}
