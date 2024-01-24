// 1) Find if the email id is on gmail.
// 2) Find username and domain name from email
//          "programmer@gmail.com"

public class firstChallenge {

    public static void main(String[] args) {
        String str = "programmer@gmail.com";

        System.out.println("Does " + str + " id is on gmail?");
        System.out.println(str.matches(".*gmail.*"));

        System.out.println("What is username and domain name of " + str + "?");

        int indexOfEta = str.indexOf("@");

        String userName = str.substring(0, indexOfEta);
        String domain = str.substring(indexOfEta);

        System.out.println("Username is: " + userName + "\nDomain is: " + domain);
    }
}