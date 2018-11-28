import com.sun.org.apache.xml.internal.utils.res.IntArrayWrapper;

public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {

        String st = str1.trim() + str2.trim();
        return st;

    }

    public Integer getIndexOrNull(String str1, char ch) {
        int index = str1.indexOf(ch);
        if (index < 0) {
            return null;
        }
        return index;
    }

    public String concatSubstring(String str1, int x, int y, String str2) {
        String st = str1.substring(x) + str2.substring(y);
        return st;
    }
}