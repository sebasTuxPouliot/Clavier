

package labo2;
import Clavier.*;

public class Labo2 {

    public static void main(String[] args) {
        ItemInventaire n1 = new ItemInventaire("super", 3.33);
        Item n2 = new Item();
        ItemInventaire n3 = new ItemInventaire("super", 3.331);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n1.equals(n3));
        System.out.println(n2.equals(n1));
        System.out.println(n1.equals(n1));
    }

}
