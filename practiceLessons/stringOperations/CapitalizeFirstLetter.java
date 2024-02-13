package practiceLessons.stringOperations;

public class CapitalizeFirstLetter {
    static String capitalizeFirstLetterName(String name) {
        String[] nameArray = name.split(" ");
        String capitalizeNewName = "";

        for (String str : nameArray) {
            String takeFirstLetter = str.substring(0, 1);
            String remainLetters = str.substring(1);

            capitalizeNewName = takeFirstLetter.toUpperCase() + remainLetters;
        }

        return capitalizeNewName;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        String name = "marin";


        System.out.println(capitalizeFirstLetterName(name));
    }
}
