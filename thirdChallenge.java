// 1) Remove special characters from a string
// 2) Remove extra spaces from a string
// 3) Find number of words in a string

public class thirdChallenge {
    public static void main(String[] args) {
        String str = "a!B@c#1$2%3";
        System.out.println("Removing special characters from: " + str);
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        String str2 = "abc  de     fgh   ijk";
        System.out.println("Removing extra spaces from: " + str2);
        System.out.println(str2.replaceAll("\\s+", " "));

        String str3 = str2.replaceAll("\\s+", " ");
        String words[] = str3.split("\\s");
        System.out.println(words.length);
    }
}
