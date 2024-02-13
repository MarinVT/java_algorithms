package listsArraysAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SmallestOfThreeNumbers2 {

    private List<Integer>list;

    public SmallestOfThreeNumbers2() {
        this.list = new ArrayList<Integer>();
    }

    public List<Integer> setList(int listSize) {
        List<Integer> list = new ArrayList<>();
        IntStream stream = IntStream.generate(() -> (int)(Math.random()*100));
        stream.limit(listSize)
                .sorted()
                .forEach(x -> list.add(x));

        return new ArrayList<Integer>(list);
    }

    public void printSmallestNumberOfThree(List<Integer> list) {
        System.out.println("Smallest number of 3 is: " + list.get(0));
    }

    public static void main(String[] args) {
        SmallestOfThreeNumbers2 smallestOfThreeNumbers2 = new SmallestOfThreeNumbers2();
        smallestOfThreeNumbers2.list = smallestOfThreeNumbers2.setList(3);
        System.out.println(smallestOfThreeNumbers2.list);
        smallestOfThreeNumbers2.printSmallestNumberOfThree(smallestOfThreeNumbers2.list);
    }
}
