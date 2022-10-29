import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month;
        int monthInt = 0;
        int dayOfMonth = 0;
        int year = 0;
        do {
            System.out.println("Entered month: ");
            month = input.next();
            System.out.println("Entered years: ");
            year = input.nextInt();

            if (year <= 0) continue;

            switch (month){
                case "1", "January", "Jan", "Jan.":
                    monthInt = 1;
                    dayOfMonth = 31;
                    break;
                case "2", "February", "Feb", "Feb.":
                    monthInt = 2;
                    if ((year % 400 == 0) || (year % 4 ==0) && (year % 100 != 0)){
                        dayOfMonth = 29;
                    }else dayOfMonth = 28;
                    break;
                case "3", "March", "Mar", "Mar.":
                    monthInt = 3;
                    dayOfMonth = 31;
                    break;
                case "4", "April", "Apr", "Apr.":
                    monthInt = 4;
                    dayOfMonth = 30;
                    break;
                case "5", "May":
                    monthInt = 5;
                    dayOfMonth = 31;
                    break;
                case "6", "June", "Jun":
                    monthInt = 6;
                    dayOfMonth = 30;
                    break;
                case "7", "July", "Jul":
                    dayOfMonth = 31;
                    monthInt = 7;
                    break;
                case "8", "August", "Aug.", "Aug":
                    monthInt = 8;
                    dayOfMonth = 31;
                    break;
                case "9", "September", "Sep", "Sept.":
                    monthInt = 9;
                    dayOfMonth = 30;
                    break;
                case "10", "October", "Oct.", "Oct":
                    monthInt = 10;
                    dayOfMonth = 31;
                    break;
                case "11", "November", "Nov.", "Nov":
                    monthInt = 11;
                    dayOfMonth = 30;
                    break;
                case "12", "December", "Dec.", "Dec":
                    monthInt = 12;
                    dayOfMonth = 31;
                    break;
                default:
                    monthInt = 0;
                    dayOfMonth =0;
            }
        }while ( monthInt <=0 || monthInt > 12 || year <=0);

        System.out.println(month + " " + year + " has " + dayOfMonth + " days.");

    }
}
