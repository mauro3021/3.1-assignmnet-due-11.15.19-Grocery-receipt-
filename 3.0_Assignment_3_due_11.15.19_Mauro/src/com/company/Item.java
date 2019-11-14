package com.company;


public class Item {
    //instances variables
    private String Name;
    private int itemCode;
    private double discount;
    private double price;
    private double computetax;
    private int Units;

    public void Item(String Name, int itemCode,int Units, double discount, double price, double computetax) {
        this.Name=Name;
        this.itemCode=itemCode;
        this.discount=discount;
        this.price=price;
        this.computetax=computetax;
        this.Units=Units;

    }
        //I don't need the bottom code? YES I DO!

    public void setUnits(int Units){
        this.Units=Units;
    }
    public int getUnits(){
        return Units;
    }

    public void setName(String Name){           //used to give value to Name
        this.Name = Name;
    }
    public String getName(){                    //return value of Name
        return Name;
    }

    public void setitemCode(int itemCode){
        this.itemCode = itemCode;
    }
    public int getItemCode(){
        return itemCode;
    }

    public void setdiscount(double discount){

        this.discount = discount;
    }
    public double getcomputediscount(){
        return discount;
    }

    public void setprice(double price){
        this.price = price;
    }
    public double getprice(){
        return price;
    }

    public void setcomputetax(double computetax){
        this.computetax = computetax;
    }
    public double getcomputetax(){
        return computetax;
    }
}

