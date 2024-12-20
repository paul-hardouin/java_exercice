import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public void execute(){
        Scanner console = new Scanner(System.in);

        while(true){
            String entry;
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("enter a number or exit");
            entry = console.nextLine();
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
        StringBuilder result = new StringBuilder()
                .append(scanedNumber.number())
            .append(" ")
            .append(scanedNumber.positive().toString())
            .append(" ")
            .append(scanedNumber.even() ? "even" : "odd");

        System.out.println(result.toString());
    }


    public static void main(String[] args) {
        new Main().execute();
    }

}