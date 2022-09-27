package ClassesWithAttributes;

public class Main {
    public static void main(String[] args){
        Product product = new Product();
        Product product1 = new Product(2, "Laptop", "Toshiba Laptop", 4000, 4, "Gri");
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}
