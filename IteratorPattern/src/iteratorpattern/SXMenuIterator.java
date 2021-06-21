package iteratorpattern;

import java.util.Iterator;

/**
 * ɳ�ز˵�������
 */
public class SXMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    /**
     * ͨ�����캯��ʵ�����洢ɳ����Ϣ�Ĳ˵�����
     * 
     * @param menuItems
     */
    public SXMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.length || menuItems[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position += 1;
        return menuItem;
    }
}

