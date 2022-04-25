/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzacafe;


abstract class Pizza {
     int pizzaQuantity=1;     
     String pizzaName;
     String size;
abstract void bill(); 
    public Pizza(int pizzaQuantity, String pizzaName, String size) {
        this.pizzaQuantity = pizzaQuantity;
        this.pizzaName = pizzaName;
        this.size = size;
    }

    public Pizza() {
    }
    
    
}
 class pizzaMenu extends Pizza{
     
     int bill=0;
  String pizzas[]= { "chickenPeproni","chickenItaliano","chickenTikka", 
                         "chickenSupreme","chickenFujita"}; 
  String SizeList[]={ "SMALL" , "MEDIUM " , "LARGE"};
      
  
        @Override
        public void bill(){
            if(pizzas[0].equals(pizzaName)){
                
                if (size.equals(SizeList[0]))
                    bill+=600;
                else if(size.equals(SizeList[1]))
                    bill+=700;
                else if (size.equals(SizeList[2]))
                    bill+=800;
                
            }
            else if(pizzas[1].equals(pizzaName)){
                
                if (size.equals(SizeList[0]))
                    bill+=700;
                else if(size.equals(SizeList[1]))
                    bill+=800;
                else if (size.equals(SizeList[2]))
                    bill+=900;
                
            }
            else if(pizzas[2].equals(pizzaName)){
                
                if (size.equals(SizeList[0]))
                    bill+=600;
                else if(size.equals(SizeList[1]))
                    bill+=700;
                else if (size.equals(SizeList[2]))
                    bill+=800;
                
            }
            else if(pizzas[3].equals(pizzaName)){
                
                if (size.equals(SizeList[0]))
                    bill+=800;
                else if(size.equals(SizeList[1]))
                    bill+=900;
                else if (size.equals(SizeList[2]))
                    bill+=1000;
                
            }
            else if(pizzas[4].equals(pizzaName)){
                
                if (size.equals(SizeList[0]))
                    bill+=750;
                else if(size.equals(SizeList[1]))
                    bill+=850;
                else if (size.equals(SizeList[2]))
                    bill+=950;
                
            }
            bill=bill*pizzaQuantity;
           
            
        }  

   public String getdescription(){
       return "pizza name is :" + pizzaName +  "\nquantity is: " +pizzaQuantity+  "\npizza size is:" + size;
   }
        

    public pizzaMenu(int pizzaQuantity, String pizzaName, String size) {
        super(pizzaQuantity, pizzaName, size);
    }  

    public pizzaMenu() {
    }
    
}



