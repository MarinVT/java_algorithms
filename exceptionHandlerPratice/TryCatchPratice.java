package exceptionHandlerPratice;

public class TryCatchPratice {
    public static void main(String[] args) {

        try {
            int[] arr1 = {4};
            System.out.println(arr1[1]);
        } catch (NullPointerException e) {
            System.out.println("Your arr is null!");
        } catch (ArrayIndexOutOfBoundsException t){
            System.out.println("index is out of bounce");
        } catch (Exception e) {
            System.out.println("Something else is wrong!");
        }
    }
}
