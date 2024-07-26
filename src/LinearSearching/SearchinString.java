package LinearSearching;

public class SearchinString {
    static boolean search(String str,char c)
    {
        if (str.isEmpty()) {
            return false;
        }
        for(char element:str.toCharArray()) {
            if (element == c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String name="Gokulnath";
        char target='n';
        System.out.println(search(name,target));
    }
}
