import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("jksfh");
        stringArrayList.add("lfdkgjd");
        stringArrayList.add("fds");
//        Comparatorable comparatorable = new Comparatorable() {
//            @Override
//            public void comparatorString(ArrayList<String> c) {
//                Collections.sort(c);
//            }
//        };
//        comparatorable.comparatorString(stringArrayList);
        Comparatorable comparatorable1 = Collections::sort;
        comparatorable1.comparatorString(stringArrayList);
        System.out.println(stringArrayList);

        MyFunctionalInterface myFunctionalInterface = Integer::sum;
        int result = myFunctionalInterface.sum(5 , 2);
        System.out.println(result);

        StringUtil stringUtil = new StringUtil();
        String resultString = stringUtil.stringActions.concate("Марк","Туров");
        System.out.println(resultString);
        System.out.println(stringUtil.stringActions.countChars(resultString));
        char [] chars = stringUtil.stringActions.findChar(resultString);
        System.out.println(Arrays.toString(chars));

    }
}