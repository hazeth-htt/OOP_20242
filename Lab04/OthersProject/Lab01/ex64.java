import java.util.Scanner;
public class ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = 0;
        while (true) {
            System.out.print("Nhập tháng (số hoặc tên tiếng Anh): ");
            String inputMonth = scanner.next().toLowerCase();

            month = convertMonth(inputMonth);
            if (month != 0) {
                break;
            }
            System.out.println("Tháng không hợp lệ! Vui lòng nhập lại.");
        }
        while (true) {
            System.out.print("Nhập năm: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 0) {
                    break;
                }
            } else {
                scanner.next();
            }
            System.out.println("Năm không hợp lệ! Vui lòng nhập lại.");
        }
        int days = getDaysInMonth(month, year);
        System.out.println("Số ngày trong tháng " + month + "/" + year + " là: " + days);

        scanner.close();
    }
    public static int convertMonth(String input) {
        switch (input) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sept": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return 0;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }
}
