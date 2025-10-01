class main{
    String name;
    float price;
    void set(String name, float price){
        this.name=name;
        this.price=price;
    }
    void get(){
        System.out.println("name : "+name);
        System.out.println("price : "+price);
    }
    public static void main(String[] args){
        main s=new main();
        s.set("potato",40);
        s.get();
    }
}