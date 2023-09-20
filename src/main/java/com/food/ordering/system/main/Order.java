package com.food.ordering.system.main;



public class Order {
    private static Order order;

    private String rice;
    private String roti;
    private String paneer;
    private String salad;
    private String coldrink;
    private String icecream;

    private Order(){

    }

    //Lazy way of creating sigelton object...
    public static Order getOrder(){
        if(order==null){
            synchronized(Order.class){
                if(order==null){
                    order = new Order();
                }
            }
        }
        return order;
    }

    public Order setRice(String rice) {
        this.rice = rice;
        return this;
    }

    public Order setRoti(String roti) {
        this.roti = roti;
        return this;
    }

    public Order setPaneer(String paneer) {
        this.paneer = paneer;
        return this;
    }

    public Order setSalad(String salad) {
        this.salad = salad;
        return this;
    }

    public Order setColdrink(String coldrink) {
        this.coldrink = coldrink;
        return this;
    }

    public Order setIcecream(String icecream) {
        this.icecream = icecream;
        return this;
    }

    public Order build(){
        return order;
    }

    public Order DineInOperation(Order order){
        return order;
    }

    public Order TakeOutOperation(Order order){
        return order;
    }

    public Order DeliveryOperation(Order order){
        return order;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Order is placed : " + this.rice+ " : "+this.roti+ " : "+ this.paneer +" : "+ this.salad+ " : "+this.coldrink+ " : "+ this.icecream;
    }

}
