public class CheckArray {
    public boolean findNumbers(int[] array) {

        int numberOne = 1;
        int numberTwo = 4;
        boolean resultNumberOne = false;
        boolean resultNumberTwo = false;


        for (int each : array) {
            if (each == numberOne) {
                resultNumberOne = true;
            } else if (each == numberTwo) {
                resultNumberTwo = true;
            } else {
                return false;
            }
        }
        return resultNumberOne && resultNumberTwo;
    }
}

class CheckArrayDemo {
    public static void main(String[] args) {
        CheckArray checkArray = new CheckArray();
        System.out.println(checkArray.findNumbers(new int[]{1, 4, 0}));
    }
}
