//Exercise 6.4: DaysInMonth
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int month = -1; 	// Khởi tạo -1 để nó luôn có giá trị
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        while (true) {
            System.out.print("Enter a month (e.g., January, Jan., Jan, 1): ");
            String inputMonth = scanner.nextLine();
            System.out.print("Enter a year (e.g., 1999): ");
            String inputYear = scanner.nextLine();

            // Kiểm tra tính đúng đắn của năm (không âm, tất cả các chữ số)
            if (inputYear.matches("\\d+")) {
                year = Integer.parseInt(inputYear);
            } else {
                System.out.println("Invalid year. Please enter a valid year.");
                continue;
            }

            // Kiểm tra tính đúng đắn của tháng
            boolean validMonth = false;
            for (int i = 0; i < months.length; i++) {
                if (inputMonth.equalsIgnoreCase(months[i]) || inputMonth.equalsIgnoreCase(months[i].substring(0, 3)) || inputMonth.equals(String.valueOf(i + 1))) {
                    month = i + 1;
                    validMonth = true;
                    break;
                }
            }

            if (!validMonth) {
                System.out.println("Invalid month. Please enter a valid month.");
                continue;
            }

            // Kiểm tra năm nhuận
            boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

            // Tính số ngày trong tháng đã chọn
            int daysInMonth;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = isLeapYear ? 29 : 28;
                    break;
                default:
                    daysInMonth = 31;
            }

            System.out.println("There are " + daysInMonth + " days in " + months[month - 1] + " " + year);
            break;
        }

        scanner.close();
    }
}
