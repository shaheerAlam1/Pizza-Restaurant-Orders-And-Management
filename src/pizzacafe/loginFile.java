/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package pizzacafe;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class loginFile {
    static Boolean log() throws IOException{
        File f = new File("login.txt");
        boolean bool = f.createNewFile(); System.out.println(bool);
        if (bool==true){
            FileWriter fw = new FileWriter(f);
            fw.write("admin admin");
            fw.close();
        }  
        Scanner sc = new Scanner(f);
        String s = null,user,pass;
        while(sc.hasNextLine()){
            s=sc.nextLine();
        }
        int i = s.indexOf(" ");
        user=s.substring(0, i);
        pass=s.substring(i+1, s.length());
        if(user.equals(loginGui.tf1.getText()) && pass.equals(loginGui.tf2.getText())){
            return true;
        }
        sc.close();
        return false;
    }
}
