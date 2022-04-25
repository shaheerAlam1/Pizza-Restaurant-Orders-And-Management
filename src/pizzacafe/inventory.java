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


/**
 *
 * @author Mani
 */
public class inventory {
    static int chickenPeproni=100;
    static int chickenItaliano=100;
    static int chickenTikka=100;
    static int chickenSupreme=100;
    static int chickenFujita=100;
    
    static void deduct(int o,String name){
       if("chickenPeproni".equals(name))
           chickenPeproni-=o;
       if("chickenItaliano".equals(name))
           chickenItaliano-=o;
       if("chickenTikka".equals(name))
           chickenTikka-=o;
       if("chickenSupreme".equals(name))
           chickenSupreme-=o;
       if("chickenFujita".equals(name))
           chickenFujita-=o;
    }
public static String getdata(){
        return "chickenPeproni = "+chickenPeproni+"\nchickenItaliano = "+chickenItaliano+"\nchickenTikka = "+chickenTikka+"\nchickenSupreme = "+chickenSupreme+"\nchickenFujita = "+chickenFujita;
    
    }
//    @Override
//    public String toString() {
//        return "chickenPeproni = "+chickenPeproni+"\nchickenItaliano = "+chickenItaliano+"\nchickenTikka = "+chickenTikka+"\nchickenSupreme = "+chickenSupreme+"\nchickenFujita = "+chickenFujita;
//    }
    

    public static int getChickenPeproni() {
        return chickenPeproni;
    }

    public static void setChickenPeproni(int chickenPeproni) {
        inventory.chickenPeproni = chickenPeproni;
    }

    public static int getChickenItaliano() {
        return chickenItaliano;
    }

    public static void setChickenItaliano(int chickenItaliano) {
        inventory.chickenItaliano = chickenItaliano;
    }

    public static int getChickenTikka() {
        return chickenTikka;
    }

    public static void setChickenTikka(int chickenTikka) {
        inventory.chickenTikka = chickenTikka;
    }

    public static int getChickenSupreme() {
        return chickenSupreme;
    }

    public static void setChickenSupreme(int chickenSupreme) {
        inventory.chickenSupreme = chickenSupreme;
    }

    public static int getChickenFujita() {
        return chickenFujita;
    }

    public static void setChickenFujita(int chickenFujita) {
        inventory.chickenFujita = chickenFujita;
    }
    
}

