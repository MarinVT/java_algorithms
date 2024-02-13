package advanceLessonsAlgorithm.DaysOfChristmas;

public class Song {
    private static String[] verses;
    private static int day;
    private String suffix;

    public final int ALL_DAYS = 12;

    public Song() {
        day = 1;
        suffix = "st";
        verses = new String[] {
                " ",
                "A patridge in a pear tree",
                "Two turtle dobes",
                "Three French hens",
                "Four calling birds",
                "Five golden rings",
                "Six geese a-laying",
                "Seven swans a-swimming",
                "Eight maids a-milking",
                "Nine ladies dancing",
                "Ten lords a-leaping",
                "Eleven pipers pipping",
                "Twelve drummers dumming"
        };
    }

    public void getVerses() {
        //looping through all 12 days
        for (int i = 0; i < ALL_DAYS; i++) {
            setSuffix();
            System.out.println(getFirstVerse(i + 1));

            //loop through verses from end, and print correct number of verses
            //based on what day of Xmas it is
            for (int j = day; j > 0; j--) {
                if (i == 1 && day != 1) {
                    System.out.println("and " + verses[j]);
                } else {
                    System.out.println(verses[j]);
                }
            }
            setDay();
            System.out.println();
        }
    }

    public String getFirstVerse(int currentDay) {
        return "On the " + currentDay + getSuffix() + " day of Christmas my love gave to me";
    }

    public static void setDay() {
        day++;
    }

    public static int getDay() {
        return day;
    }


    public void setSuffix() {
        switch (day) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
                break;
        }
    }

    public String getSuffix() {
        return suffix;
    }
}



















