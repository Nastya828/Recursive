package s01;

//4. проверка, является ли строка палиндромом;
public class Task4 {
    public static void main(String[] args) {
        String palindrom = "9145665410";
        System.out.println(checkPalindrom(palindrom));
    }

    static public boolean checkPalindrom(String palindrom) {
        if (palindrom.length() < 2) {
            return true;
        }
        return (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1))
                && checkPalindrom(palindrom.substring(1, (palindrom.length() - 1)));
    }
}
