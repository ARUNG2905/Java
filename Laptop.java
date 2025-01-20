class Laptop{
    String Brand,Ram;
    Double Price;

    Laptop(Double Price,String Brand,String Ram){
        this.Price=Price;
        this.Brand=Brand;
        this.Ram=Ram;
    }
    Laptop(){
        this.Brand="Apple";
        this.Price=72000.0;
        this.Ram="8GB";
    }
    public static void main(String[] args) {
        Laptop l1=new Laptop(48000.0,"Dell","6GB");
        System.err.println(l1.Price+"  "+l1.Brand+"  "+l1.Ram);
        Laptop l2=new Laptop();
        System.err.println(l2.Price+"  "+l2.Brand+"  "+l2.Ram);

    }


}