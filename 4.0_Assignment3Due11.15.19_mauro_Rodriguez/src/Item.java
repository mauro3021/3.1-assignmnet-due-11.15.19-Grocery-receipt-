public class Item {
    private int itemCode;
    private String Name;
    double iC;
    String nE;

 /*   Item(double iC, String nE) {
        itemCode = iC;
        Name = nE;
    }*/
    //constructor for Grocery need to able to pass set and get values
    public void Item(double price, double units, double discount, double tax) {
    }

    public void setItemCode(int itemcode) { this.itemCode=itemCode; }
    public int getitemCode(){return itemCode;}

    public void setName(String Name){this.Name=Name;}
    public String getName(){return Name;}



    public void display() {
        //display();
        System.out.println("itemCode: " + itemCode);
        System.out.println("Name:     " + Name);
    }
}








