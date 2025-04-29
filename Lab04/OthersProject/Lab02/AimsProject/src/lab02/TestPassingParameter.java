package lab02;

public class TestPassingParameter {
    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        System.out.println("Inside swap(): o1 = " + ((DigitalVideoDisc) o1).getTitle());
        System.out.println("Inside swap(): o2 = " + ((DigitalVideoDisc) o2).getTitle());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        dvd = new DigitalVideoDisc(title);
    }

    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        System.out.println("Before swap(): jungle = " + jungleDVD.getTitle());
        System.out.println("Before swap(): cinderella = " + cinderellaDVD.getTitle());

        swap(jungleDVD, cinderellaDVD);

        System.out.println("After swap(): jungle = " + jungleDVD.getTitle());
        System.out.println("After swap(): cinderella = " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("After changeTitle(): jungle = " + jungleDVD.getTitle());
    }
}

