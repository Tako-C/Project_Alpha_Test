package sit.int202;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class PropblemFour {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data1.txt");
        Scanner sc = new Scanner(file);
        Map<String, List<Integer>> map = new TreeMap<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, " .,?()");
            int wordIndex = 0;
            while (stk.hasMoreElements()){
                String word = stk.nextToken();
                if (map.get(word) == null) {
                    map.put(word, new LinkedList<Integer>());
                }
                map.get(word).add(wordIndex++);
            }
        }
        sc.close();

        System.out.println("Output Example:");
        for (Map.Entry<String,List<Integer>> entry :map.entrySet()) {
            String number = "8";
            if (entry.getKey().equals(number) ) {
                System.out.print(entry.getKey() + "(" + entry.getValue().size() + "): ");
                for (Integer position : entry.getValue()) {
                    System.out.print("@" + position + "  ");
                }
                System.out.println();
            }
        }
    }
}

