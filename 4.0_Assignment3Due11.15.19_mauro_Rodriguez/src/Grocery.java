public class Grocery extends Item implements Discount, Tax{

    private int Itemcode;
    private String Name;
    private double units;
    private double price;
    private double discount;            //user must input as % such as 10 or 20 percent
    private double tax;

    public void Grocery(int Itemcode, String Name, double units, double price, double discount, double tax) {

        this.Itemcode = Itemcode;
        this.Name=Name;
        this.units=units;
        this.price=price;
        this.discount=discount;
        this.tax=tax;
    }
        //no values input, they are computed with the above
        private double subTotal;
        private double savings;

    /*//constructor for Grocery can input values from main
    public Grocery(double price, double units, double discount, double tax){
    //super(price, units, discount,tax);
    }*/

        public void setItemcode ( int Itemcode){
            this.Itemcode = Itemcode;
        }
        public int getItemcode () {
            return Itemcode;
        }

        public void setName (String Name){
            this.Name = Name;
        }
        public String getName () {
            return Name;
        }

        public void setunits ( double units){
            this.units = units;
        }
        public double getunits () {
            return units;
        }

        public void setprice ( double price){
            this.price = price;
        }
        public double getprice () {
            return price;
        }

        public void setdiscount ( double discount){
            this.discount = discount;
        }
        public double getdiscount () {
            return discount;
        }

        public void settax(double tax){this.tax=tax;}
        public double gettax(){
            tax=(tax/100)*price;
            return tax;
        }

        //@Override//storing discount in discount
        public double computeDiscount () {
            savings = (discount / 100.0) * price;
            return savings;
        }

        // @Override//tax is "0.00" for groceries
        public double computeTax () {
            tax = (tax * price);
            return tax;
        }

        double finalPrice = ((price - discount) + tax);


        public void displayGrocery () {                               //public void needed?
            display();                                              //this needed?
            System.out.println("---------------------Grocery---------------");

            System.out.println("\nItem code:   " + Itemcode);              //this stand for itemCode
            System.out.println("Name:        " + Name);
            System.out.println("Unit price:  " + price);
            System.out.println("Units #:     " + units);              //do I set the number of units manually?
            System.out.println("Savings:     " + savings);            //have no initiated this any where
            System.out.println("SubTotal:    " + subTotal);           //have not initiated this variable
            System.out.println("Tax Amount:  " + tax);
            System.out.println("Final Price: " + finalPrice);         //have not initiated this variable
        }



}
