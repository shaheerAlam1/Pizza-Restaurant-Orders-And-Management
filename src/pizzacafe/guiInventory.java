/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacafe;
/**
 *
 * @author Hp
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author hp
 */
public class guiInventory {
    static JLabel l2;
    static JTextArea ja; 
    static JFrame f;
    static JPanel p;
    public guiInventory(){
        f=new JFrame("PIZZACAFE");
        f.setSize(350,300);
        f.setResizable(false);
         f.setLocation(700, 300);
        p=new JPanel(new GridBagLayout ());
        p.setBackground(Color.BLACK);
        l2=new JLabel("STOCK");
        l2.setFont(new Font("ZapfDingbats", Font.BOLD, 22));
        l2.setForeground(Color.WHITE);
        ja=new JTextArea(20,20);
        ja.setText(inventory.getdata());
        ja.setEditable(false);
        GridBagConstraints c1=new GridBagConstraints();
        c1.insets=new Insets(3,3,3,3);
        c1.ipady=15;
        c1.gridx=0; c1.gridy=0; p.add(l2,c1);
        c1.gridy=1; p.add(ja,c1);
        f.add(p);
        f.setVisible(true);
        
    }
}

