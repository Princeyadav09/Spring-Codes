
public class Product {
    private static Product product;

    private Product(){

    }
    //Lazy way of creating sigelton object...
    public static Product getProduct(){
        if(product==null){
           synchronized(Product.class){
                if(product==null){
                product = new Product();
                }
           }
        }
        return product;
    }
}
