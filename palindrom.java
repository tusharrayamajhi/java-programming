
class palindrom{
    public static boolean ispalindrom(String str) {
        int l = str.length() / 2;
        for (int i = 0; i <= l; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "noon";
        System.out.println(ispalindrom(str));
        System.out.println("hello world");
    }
}
