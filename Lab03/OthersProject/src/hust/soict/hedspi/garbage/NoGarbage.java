package hust.soict.hedspi.garbage;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            s.append("abc");
        }
        System.out.println("Done efficiently!");
    }
}