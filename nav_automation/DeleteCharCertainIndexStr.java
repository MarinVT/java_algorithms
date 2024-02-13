package nav_automation;

public class DeleteCharCertainIndexStr {
    public static void main(String[] args) {

        System.out.println(charRemoveAtIndex("Marin", 2));
    }

    static String charRemoveAtIndex(String str, int position) {
        return str.substring(0, position) + str.substring(position + 1);
    }
}
