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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class specialPizzaGui extends pizzaMenu {
    static JFrame f;
    static JButton b;
    static JLabel l;
    static JPanel p;
    static JPanel p2;
    static JComboBox cb,cb2;

    
    specialPizzaGui (){
        f=new JFrame("PIZZACAFE");
        f.setSize(500,500);
        f.setResizable(false);
         f.setLocation(700, 300);
        p=new JPanel(new GridBagLayout ());
        p2=new JPanel(new GridBagLayout ());
        p.setBackground(new Color(179, 207, 207));
        l=new JLabel("SPECIAL PIZZA MENU");l.setForeground(Color.WHITE);
        l.setFont(new Font("TimesRoman", Font.BOLD, 22));
         p2.setBackground(new Color(173, 105, 137));
        f.add(p2,BorderLayout.NORTH);
        cb=new JComboBox(super.pizzas);
        cb2=new JComboBox(super.SizeList);
        b=new JButton("GENERATE BILL");
        GridBagConstraints c1=new GridBagConstraints();
        
        c1.insets=new Insets(3,3,3,3);
        c1.ipady=20;
        p2.add(l,c1);
        c1.ipadx=70;
        c1.gridx=0; c1.gridy=0; //p2.add(l,c1);
        c1.gridy=1; p.add(cb,c1);
        c1.gridy=2;p.add(cb2,c1);
        c1.gridy=3;p.add(b,c1);
        
        f.add(p);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                bill=0;
                new billing();
                pizzaName=(String)cb.getSelectedItem();
                size=(String)cb2.getSelectedItem();
                inventory.deduct(pizzaQuantity, pizzaName);
                bill();//;System.out.println(s);
                billing.ja.setText(getdescription());
                billing.tf.setText(bill+" RS");
                File orderCount = new File ("orderCount.txt");
                
                String s;
                Scanner scanOrderCount;
                try {
                    boolean oc=orderCount.createNewFile(); System.out.println(oc);
                    if (oc==true){
                        FileWriter fwrite = new FileWriter(orderCount);
                        fwrite.write(0+"");
                        fwrite.close();
                    }
                    scanOrderCount = new Scanner(orderCount);
                    int count=Integer.valueOf(scanOrderCount.nextLine());     System.out.println(count);
                    scanOrderCount.close();
                    count++; System.out.println(count);
                    FileWriter fw=new FileWriter(orderCount);
                    fw.write(count+"");
                    fw.close();
                    s="order NO"+count+".txt";
                    File order = new File (s);
                    boolean bool=order.createNewFile(); System.out.println(bool);
                    FileWriter fw2=new FileWriter(order);
                    fw2.write(getdescription()+"\n"+bill+" RS");
                    fw2.close();
                } catch (IOException ex) {
                    System.out.println(ex);
                }
                
            }
        });
        
}
}
