package iteratorpattern;

/**
 * ������װ�˵�ʳ����Ϣ
 */
public class MenuItem {
    String name;   //ʳ������
    double price;    //ʳ��۸�

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
