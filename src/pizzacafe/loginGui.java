/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package pizzacafe;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Hp
 */
public class loginGui extends JFrame {
    static JFrame f;
    static JPanel p;
    static JTextField tf1,tf2;
    static JButton b;
    static JLabel l1,l2;
    public loginGui() {
        super("Login");
        f=this;
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(700, 300);
        p = new JPanel(new GridBagLayout());
        //p.setBackground(new Color(61,164,171));
        p.setBackground(new Color(173, 105, 137));
        tf1= new JTextField(15);
        tf2=new JTextField(15);
        b=new JButton("LOGIN");b.setBackground(new Color(207,232,233));b.setFont(new Font("TimesRoman", Font.BOLD, 14));
        b.setForeground(Color.darkGray);
        l1=new JLabel("USERNAME");l1.setForeground(Color.WHITE);l1.setFont(new Font("TimesRoman", Font.BOLD, 14));
        l2=new JLabel("PASSWORD");l2.setForeground(Color.WHITE);l2.setFont(new Font("TimesRoman", Font.BOLD, 14));
        GridBagConstraints c = new GridBagConstraints();
        c.ipady=15;
        c.gridx=0;
        c.gridy=1;p.add(l1,c);
        c.gridy=2;p.add(tf1,c);
        c.gridy=3;p.add(l2,c);
        c.gridy=4;p.add(tf2,c);
        c.insets=new Insets(10,10,10,10);
        c.ipady=15; c.gridy=5;p.add(b,c);
        f.add(p);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                boolean flag = false;
                try{
                    flag= loginFile.log();
                }
                catch(IOException E){
                    System.out.println(E);
                }
                if (flag==false){
                    JDialog d = new JDialog(f, "dialog Box");d.setLayout(new FlowLayout(FlowLayout.CENTER));
                    d.setSize(300, 150);d.setLocation(790, 420);
                    JButton dbutton = new JButton("OK");
                    dbutton.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            d.dispose();;
                        }     
                    });
                    JLabel l = new JLabel("WRONG PASSWORD OR USERNAME");
                    d.add(l);
                    d.add(dbutton);d.setVisible(true);
                }
                else if (flag==true){
                   new menuGui();
                   dispose();
                }
            }});
    }  
}
