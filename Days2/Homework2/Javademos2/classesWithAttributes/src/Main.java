class Main {
    public static void main(String[] args) {
        Product product = new Product (1,"Laptop",4000,"Asus Laptop", 3);
        //Product product = new Product();
        //product.setId(1);
        //product.setName("Laptop");
        //product.setDescription("Asus Laptop");
        //product.setPrice(5000);
        //product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}