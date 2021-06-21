package iteratorpattern;

/**
 * 用来封装菜单食物信息
 */
public class MenuItem {
    String name;   //食物名字
    double price;    //食物价格

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
