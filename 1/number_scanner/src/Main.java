import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void execute(){
        Scanner console = new Scanner(System.in);

        while(true){
            System.out.println("enter a number or exit");
            String entry = console.nextLine();
            if (entry.equals("exit")) {
                break;
            }
            int entryNumber;
            try {
                entryNumber = Integer.parseInt(entry);
                ScanedNumber scanedNumber = scanNumber(entryNumber);
                printNumber(scanedNumber);
            }
            catch (NumberFormatException _) {}

        }
    }

    private ScanedNumber scanNumber(int number) {
        return new ScanedNumber(number, number % 2 == 0, Positive.intToPositive(number));
    }

    private void printNumber(ScanedNumber scanedNumber) {
        String result = scanedNumber.number() +
                " " +
                scanedNumber.positive().toString() +
                " " +
                (scanedNumber.even() ? "even" : "odd");

        System.out.println(result);
    }


    public static void main(String[] args) {
        new Main().execute();
    }

}