/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacafe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class menuGui   {
    static JFrame f1;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    
    menuGui (){
        f1=new JFrame("PIZZACAFE");
        f1.setSize(500,500);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocation(700, 300);
        JPanel p1=new JPanel(new GridBagLayout ());
        p1.setBackground(new Color(255, 172, 183));
        JLabel l1=new JLabel("MENU");l1.setForeground(Color.WHITE);
        l1.setFont(new Font("ZapfDingbats", Font.BOLD, 20));
        b1=new JButton("SPECIAL PIZZA MENU");
        //b1.setBackground(new Color(207,232,233));
        b1.setBackground(new Color(208, 227, 193));
        b1.setFont(new Font("TimesRoman", Font.BOLD, 16));
        b2=new JButton("MAKE YOUR OWN PIZZA");
        b2.setBackground(new Color(208, 227, 193));
        //b2.setBackground(new Color(207,232,233));
        b2.setFont(new Font("TimesRoman", Font.BOLD, 16));
        GridBagConstraints c1=new GridBagConstraints();
        c1.insets=new Insets(3,3,3,3);
        c1.ipady=15;
        c1.gridx=0; c1.gridy=0; p1.add(b1,c1);
        c1.gridy=1; p1.add(b2,c1);
        JPanel p2=new JPanel(new GridBagLayout());
        p2.setBackground(new Color(173, 105, 137));
        c1.gridy=0; p2.add(l1,c1);
        f1.add(p1);
        f1.add(p2,BorderLayout.NORTH);
        JPanel p3=new JPanel (new GridBagLayout());p3.setBackground(Color.gray);
        f1.add(p3,BorderLayout.SOUTH);
        b3=new JButton("Inventary status");
        b3.setBackground(Color.darkGray);
        b3.setFont(new Font("calibri", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        c1.ipady=15;
        p3.add(b3,c1);
        f1.setVisible(true);
       b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                new specialPizzaGui();
            }
       });
       b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                new CustomPizzaGui();
            }
       });
       b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                new guiInventory();
            }
       });
    }
}