// 1) Find if a Number is Binary or not
// 2) Find is a Number is Hexa-Decimal or not
// 3) Find is the data in Date format (dd/mm/yyyy)

public class secondChallenge {
    public static void main(String[] args) {
        int a = 10110001;
        String stringB = a + "";
        String hexa = "234AB";
        String date = "01/12/2000";

        System.out.println("Is Number a Binary or not?");

        System.out.println(stringB.matches("[01]*"));

        System.out.println("Is Number a Hexa-Decimal or not?");
        System.out.println(hexa.matches("[0-9A-F]+"));

        System.out.println("Is Date have Date format or not?");
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
