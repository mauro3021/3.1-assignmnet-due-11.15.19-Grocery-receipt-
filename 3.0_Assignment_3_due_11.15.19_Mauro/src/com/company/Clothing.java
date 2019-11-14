package com.company;

public class Clothing {

        private int itemCode;
        private String Name;
        private int Units;
        private double Price;
        private String Brand;
        private  double Discount;


    public void Clothing(int itemCode, String Name, int Units, double Price, String Brand, double Discount){
        this.itemCode=itemCode;
        this.Name=Name;
        this.Units=Units;
        this.Price=Price;
        this.Brand=Brand;
        this.Discount=Discount;
    }

    public void setitemCode(int itemCode){
        this.itemCode=itemCode;
    }
    public int getItemCode(){
        return itemCode;
    }

    public void setName(String Name){           //used to give value to Name
        this.Name = Name;
    }
    public String getName(){                    //return value of Name
        return Name;
    }

    public void setUnits(int Units){
        this.Units=Units;
    }
    public int getUnits(){return Units;}

    public void setPrice(double Price){this.Price=Price;}
    public double getPrice(){return Price;}

    public void setBrand(String Brand){this.Brand=Brand;}
    public String getBrand(){return Brand;}

    public void setDiscount(double Discount){this.Discount=Discount;}
    public double getDiscount(){return Discount;}

}
