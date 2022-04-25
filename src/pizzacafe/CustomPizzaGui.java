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
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import static pizzacafe.menuGui.f1;

/**
 *
 * @author hp
 */
public class CustomPizzaGui extends customPizza{
    static JLabel l1,l2,l3,l4,l5,l6;
    static JFrame f;
    static JButton b;
    static JSpinner sp1,sp2,sp3;
    static JComboBox combo0,combo,combo1,combo2 ;
  

   
    
    CustomPizzaGui(){
        f=new JFrame("PIZZACAFE");
        f.setSize(600,500);
        f.setResizable(false);
        f.setLocation(700, 300);
        JPanel p=new JPanel(new GridBagLayout ()); p.setBackground(new Color(255, 172, 183));
        JPanel p1=new JPanel(new GridBagLayout ());p1.setBackground(new Color(173, 105, 137));
        JPanel p2=new JPanel(new GridBagLayout ());p2.setBackground(Color.LIGHT_GRAY);
        JPanel p3 = new JPanel(new GridBagLayout ());p3.setBackground(new Color(179, 207, 207));
        GridBagConstraints c = new GridBagConstraints();
        GridBagConstraints c1 = new GridBagConstraints();
        GridBagConstraints c2 = new GridBagConstraints();
        l4=new JLabel("MAKE YOUR OWN PIZZA");l4.setFont(new Font("TimesRoman", Font.BOLD, 22));l4.setForeground(Color.WHITE);
         c.insets=new Insets(15,15,15,15);
        p1.add(l4,c);
        l1=new JLabel("Select   your  Pizza:");l1.setFont(new Font("TimesRoman", Font.BOLD, 12));
        l2=new JLabel("Select your  Topping:");l2.setFont(new Font("TimesRoman", Font.BOLD, 12));
        l3=new JLabel("Select Crust Filling:");l3.setFont(new Font("TimesRoman", Font.BOLD, 12));
        c.insets=new Insets(75,15,10,10);
        c.gridx=0;
        c.gridy=0;p.add(l1,c);//c.insets=new Insets(75,15,10,10);
        c.gridy=1;p.add(l2,c);
        c.gridy=2;p.add(l3,c);
        b=new JButton("GENERATE BILL");b.setBackground(Color.BLACK);b.setForeground(Color.WHITE);
        c1.ipady=15;
        c1.ipadx=600;
         c1.insets=new Insets(0,-80,0,0);
        c1.gridx=0;c1.gridy=0;p2.add(b,c1);
        
        combo = new JComboBox(pizzas);
        combo0=new JComboBox(SizeList);
        combo1 = new JComboBox(toppings);
        combo2 = new JComboBox(crust);
        c2.insets=new Insets(10,10,10,10);
        c2.ipadx=75;
        c2.ipady=25;
        c2.gridx=0;
        c2.gridy=0;p3.add(combo,c2);
        c2.gridy=1;p3.add(combo1,c2);
        c2.gridy=2;c2.ipadx=35;p3.add(combo2,c2);
        sp1=new JSpinner();
        sp2=new JSpinner();
        sp3=new JSpinner();
        c2.gridx=1;c2.gridy=0; c2.ipadx=20;p3.add(combo0,c2);
        c.ipadx=30;
        c2.gridx=2;c2.gridy=0;p3.add(sp1,c2);
        c2.gridx=2;c2.gridy=1;p3.add(sp2,c2);
        c2.gridx=2;c2.gridy=2;p3.add(sp3,c2);
        f.add(p,BorderLayout.WEST);
        f.add(p2,BorderLayout.SOUTH);
        f.add(p1,BorderLayout.NORTH);
        f.add(p3);
        f.setVisible(true);
       b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                bill=0;
                 new billing(); 
                pizzaName=(String)combo.getSelectedItem();
                size=(String)combo0.getSelectedItem();
                pizzaQuantity =(Integer)sp1.getValue();
                toppingName=(String)combo1.getSelectedItem();
                toppingQuantity=(Integer)sp2.getValue();
                crustName=(String)combo2.getSelectedItem();
                crustQuantity=(Integer)sp3.getValue();
                inventory.deduct(pizzaQuantity, pizzaName);
                billing.ja.setText(getdescription());
                bill();
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
                    int count=Integer.valueOf(scanOrderCount.nextLine());System.out.println(count);
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

