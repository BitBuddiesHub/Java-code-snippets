package Day_6;

import java.util.ArrayList; 

public class CSA2 {

    public static void main(String[] args) {
        String num = "4327";
        ArrayList<Integer> results = new ArrayList<>(); 
        for (int i = 0; i < num.length(); i++) {
            for (int j = i + 1; j < num.length(); j++) {
                if (Integer.parseInt(num.substring(i, i+1)) > Integer.parseInt(num.substring(j, j+1))) {
                    results.add(Integer.parseInt(num.substring(i, i+1)));
                    results.add(Integer.parseInt(num.substring(j, j+1)));
                }
            }
        }

        System.out.print("Array[");
        for (int k = 0; k < results.size(); k++) {
            System.out.print(results.get(k));
            if (k < results.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
