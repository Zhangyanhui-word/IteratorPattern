package iteratorpattern;

import java.util.Iterator;

public class Waitress {
    BZMenu bzMenu;
    SXMenu sxMenu;

    public Waitress(BZMenu bzMenu, SXMenu sxMenu){
        this.bzMenu = bzMenu;
        this.sxMenu = sxMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> iterator = bzMenu.createIterator();
        Iterator<MenuItem> iterator1 = sxMenu.createIterator();

        System.out.println("���Ӳ˵�Ϊ��");
        printMenu(iterator);
        System.out.println("ɳ�ز˵�Ϊ��");
        printMenu(iterator1);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ": ");
            System.out.println(menuItem.getPrice());
        }
    }
}
