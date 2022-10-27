

public  class This_keyword{
    public static void main(String[] args){
        //create an object
        Bill chairBill = new Bill();
        chairBill.setPriceOfChair(100);
        System.out.println("Price of chair:"+chairBill.getPriceOfChair());
    }
}

class Bill{
    double priceOfTable;
    double priceOfChair;

    void setPriceOfChair(double chairPrice){
        this.priceOfChair = chairPrice;
    }
    double getPriceOfChair(){
        return this.priceOfChair;
    }
}