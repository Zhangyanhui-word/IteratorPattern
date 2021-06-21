package iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ���Ӳ˵��࣬ʵ���� Menu �ӿ��е� createIterator() ����
 */
public class BZMenu implements Menu{
    List<MenuItem> menuItems;

    /**
     * ͨ�����캯�����ڲ˵������һЩ��Ʒ
     */
    public BZMenu() {
        menuItems = new ArrayList<>();

        addItem("ѩ�˰�",1.0);
        addItem("������",2.0);
        addItem("�²˰�",1.0);
        addItem("�����",2.0);
    }

    public void addItem(String name, double price){
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    /**
     * ���ذ��Ӳ˵���Ϣ�ĵ�����
     * 
     * @return
     */
    @Override
    public Iterator<MenuItem> createIterator() {
        return new BZMenuIterator(menuItems);
    }
}

