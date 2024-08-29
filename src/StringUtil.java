public class StringUtil {
    StringActions stringActions = new StringActions() {
        @Override
        public String concate(String s1, String s2) {
            return s1+s2;
        }

        @Override
        public int countChars(String s1) {
            return s1.toCharArray().length;
        }

        @Override
        public char[] findChar(String c) {
            char [] chars = c.toCharArray();
            return chars;
        }
    };

}
