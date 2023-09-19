
public class Example {

    public static void main(String args[]){
        Product obj1 =  Product.getProduct();
        Product obj2 =  Product.getProduct();
    
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
