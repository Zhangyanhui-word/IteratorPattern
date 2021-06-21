package iteratorpattern;


import java.util.Iterator;
import java.util.List;

/**
 * ���Ӳ˵���Ϣ������
 */
public class BZMenuIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    /**
     * ͨ�����캯����ʵ�����洢������Ϣ�Ĳ˵� List ����
     * ��Ȼ����ֱ��ʹ�� Iterator ���������ϣ�Ϊ�˸�����������ģʽ�������Լ���дһ��������
     * 
     * @param menuItems
     */
    public BZMenuIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}

