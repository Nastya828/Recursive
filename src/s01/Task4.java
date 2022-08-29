package s01;

//4. проверка, является ли строка палиндромом;
public class Task4 {
    public static void main(String[] args) {
        String palindrom = "14566541";
        System.out.println(checkPalindrom(palindrom));
    }

    static public boolean checkPalindrom(String palindrom) {
        if (palindrom.length() < 2) {
            return true;
        }
        boolean isPalindrom = (palindrom.charAt(0) == palindrom.charAt(palindrom.length() - 1));
        return isPalindrom && checkPalindrom(palindrom.substring(1, (palindrom.length() - 1)));
    }
}
