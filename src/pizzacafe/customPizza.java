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
class customPizza extends pizzaMenu{
    
    String toppingName;
     String crustName;
    int toppingQuantity=1;
     int crustQuantity=1;
    String toppings[]= { "Olives","Capsicum", 
                         "PineApple"}; 
      String crust[]= {"Cheese","Mozerella Cheese","Seekh Kebab"}; 

    public customPizza(int pizzaQuantity, String pizzaName, String size,String toppingName, String CrustName, int toppingQuantity, int crustQuantity) {
        super(pizzaQuantity, pizzaName, size);
        this.toppingName = toppingName;
        this.crustName = CrustName;
        this.toppingQuantity = toppingQuantity;
        this.crustQuantity = crustQuantity;
        
    }
    
    @Override
    public void bill(){
        
        super.bill();
        if(toppingQuantity==0){}
        else{
        if("Olives".equals(toppingName)){
            super.bill= super.bill+(50*toppingQuantity);
        }
        else if ("Capsicum".equals(toppingName)){
             super.bill= super.bill+(50*toppingQuantity);
        }
        else if ("PineApple".equals(toppingName)){
              super.bill= super.bill+(50*toppingQuantity);
        }
        }
       if(crustQuantity==0){}
       else{
       if("Cheese".equals(crustName)){
              super.bill= super.bill+(80*crustQuantity);
        }
       else if ("Mozerella Cheese".equals(crustName)){
              super.bill= super.bill+(80*crustQuantity);
        }
       else if("Seekh Kebab".equals(crustName)){
             super.bill= super.bill+(80*crustQuantity);
        }
       }
       
    }
     public String getdescription(){
         return super.getdescription() +"\ntopping name:"+  toppingName+"\ncrust Name:"+  crustName+ "\ntopping Quantity:" +toppingQuantity+ "\ncrust Quantity:"+crustQuantity;
     }

    public customPizza() {
    }
     
}
