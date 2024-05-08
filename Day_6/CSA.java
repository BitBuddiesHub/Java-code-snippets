package Day_6;

public class CSA {

    public static void main(String[] args) {
        String num = "43271";
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (Integer.parseInt(num.substring(i, i+1)) > Integer.parseInt(num.substring(j, j+1))) {
                    System.out.print("(" + num.charAt(i) + "," + num.charAt(j) + ")");
                }
            }
        }
    }
}
