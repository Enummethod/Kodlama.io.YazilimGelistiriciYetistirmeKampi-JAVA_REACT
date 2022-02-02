public class Product {

    private int _id; // field - Attributes
    private String _name;
    private double _price;
    private String _description;
    private int _stockAmount;
    private String _kod ;


    public Product(){
        System.out.println("Counstractor Çalıştı...");
    }

    public Product(int id,String name,double price,String description, int stockAmount){
        _id =id;
        _name = name;
        _price = price;
        _description = description;
        _stockAmount = stockAmount;
    }


    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public int getStockAmount() {
        return _id;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public double getPrice() {
        return _price;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public String getKod(){
        return _name.substring(0,1) + _id;
    }

}