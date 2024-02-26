import java.util.Arrays;

class ArraySecond {

    public void Firsttask() {
        int[] array = new int[100];
        populateArray(array, -100, 100);
        sortPositiveNegativeZero(array);
        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(array));
        PrintLine();
    }

    private void populateArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    private void sortPositiveNegativeZero(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            while (left <= right && array[left] > 0) {
                left++;
            }
            while (left <= right && array[right] <= 0) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        int mid = left;
        for (int i = left; i < right; i++) {
            if (array[i] > 0 && array[i + 1] < 0) {
                mid = i + 1;
                break;
            }
        }
        int temp = array[mid];
        array[mid] = 0;
        array[array.length / 2] = temp;
    }

    public void PrintLine(){
        System.out.println();
        for(int i = 0; i<45; i++){
            System.out.print('-');
        }
        System.out.println();
    }
}
