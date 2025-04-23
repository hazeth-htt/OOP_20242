package hust.soict.hedspi.aims.test.cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        System.out.println("Inside swap(): o1 = " + ((DigitalVideoDisc) o1).getTitle());
        System.out.println("Inside swap(): o2 = " + ((DigitalVideoDisc) o2).getTitle());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd = new DigitalVideoDisc(title, "Unknown", "Unknown", 60, 9.99f);
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swap: dvd1 = " + dvd1.getTitle() + ", dvd2 = " + dvd2.getTitle());
        swap(dvd1, dvd2);
        System.out.println("After swap: dvd1 = " + dvd1.getTitle() + ", dvd2 = " + dvd2.getTitle());

        changeTitle(dvd1, dvd2.getTitle());
        System.out.println("After changeTitle: dvd1 = " + dvd1.getTitle());
    }
}