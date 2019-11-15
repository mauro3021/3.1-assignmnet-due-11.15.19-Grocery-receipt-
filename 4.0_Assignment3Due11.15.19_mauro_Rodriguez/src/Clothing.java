public class Clothing extends Item{

    private int itemCode;
    private String Name;
    private double units;
    private double price;
    private String brand;
    private double discount;

    //no values input, they are computed
    private double subTotal;
    private double savings;

    final double taxp=8.5;
    double taxT;                //this is public if need be
    double computeTotalPrice;


 /*   //constructor clothing, to give values and send over to super class ITEM
    public Clothing(double price, double units, double discount, double tax) {
       // super(price, units, discount, tax);
    }
    //to give values
   public void Item(int itemCode, String Name, double units, double price, String brand, double discount) {
        this.itemCode=itemCode; this.Name=Name; this.units=units; this.price=price; this.brand=brand; this.discount=discount;
    }// end of Item
    */


    //SET and GET
    public void setitemCode(int itemCode){this.itemCode=itemCode;}
    public int getitemCode(){return itemCode;}

    public void setName(String Name){this.Name=Name;}
    public String getName(){return Name;}

    public void setunits(double units){this.units=units;}
    public double getunits(){return units;}

    public void setprice(double price){this.price=price;}
    public double getprice(){return price;}

    public void setbrand(String brand){ this.brand=brand; }
    public String getbrand(){return brand;}

    public void setdiscount(double discount){this.discount=discount;}
    public double getdiscount(){return discount;}


    // @Override//storing discount in discount
    public double computeDiscount() {
        savings = (discount / 100.0) * price;
        return savings;
    }

    // @Override//tax is already defined as 8.5%
    public double computeTax() {
        taxT = ((price-savings)*taxp);
        return taxT;
    }

    //need to compute subtotal, meaning before tax and before discount
    public double computeSubTotal(){
        subTotal = price*units;
        return subTotal;
    }

    //solving for total price @ 1 unit
    double computeTotalPrice(){
        computeTotalPrice = ((subTotal-savings)+taxT);
        return computeTotalPrice;
    }


    //display clothing
    public void displayClothing(){
        display();
        System.out.println("---------------Clothing items---------------");

        System.out.println("\n\nitemCode:   "+itemCode );       //need to create local?
        System.out.println("Name:        "+Name );               //need to create local?
        System.out.println("Brand:       "+brand );
        System.out.println("Unit Price:  $"+price );
        System.out.println("Units #:     "+units );
        System.out.println("Sub total:   $"+subTotal );          //need to create local?
        System.out.println("Savings:     $"+savings);           //need to create local?
        System.out.println("Tax amount:  $"+taxT);
        System.out.println("Final Price: $"+computeTotalPrice);

    }


}//end of Clothing
