package hust.soict.hedspi.garbage;

public class GarbageCreator {
    public static void main(String[] args) {
        String s = "";
        for (int i = 0; i < 1_000_000; i++) {
            s += "abc";
        }
        System.out.println("Done generating garbage!");
    }
}