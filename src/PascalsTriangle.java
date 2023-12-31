import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>() {{
            add(new ArrayList<>(){{
                add(1);
            }});
        }};
        if (numRows > 1) {
            list.add(new ArrayList<>(){{
                add(1);
                add(1);
            }});
        }
//        System.out.println(list);
        if (numRows > 2) {
            for (int j = 1; j < numRows - 1; j++) {
                List<Integer> into = new ArrayList<>(){{
                    add(1);
                    add(1);
                }};
                for (int i = 0; i < list.get(j).size() - 1; i++) {
                    into.add(i + 1, list.get(j).get(i) + list.get(j).get(i + 1));
                }
                list.add(into);
            }
        }
        return list;
    }
}
