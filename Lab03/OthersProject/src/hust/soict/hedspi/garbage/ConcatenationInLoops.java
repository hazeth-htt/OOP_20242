package hust.soict.hedspi.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int times = 100000;

        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < times; i++) {
            s += "abc";
        }
        long end = System.currentTimeMillis();
        System.out.println("String (+): " + (end - start) + "ms");

        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sbf.append("abc");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append("abc");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + "ms");
    }
}