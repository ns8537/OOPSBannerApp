public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = buildBanner();

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Build full OOPS banner
    public static String[] buildBanner() {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        return banner;
    }

    // Letter O
    public static String[] buildO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Letter P
    public static String[] buildP() {
        return new String[] {
                "*****  ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      "
        };
    }

    // Letter S
    public static String[] buildS() {
        return new String[] {
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        };
    }
}