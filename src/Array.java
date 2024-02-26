import java.util.Arrays;

class Array
{
    public void FirstTask() {
        int[] array = {6, 3, 32, 423, 1};
        int biggestNumberIndex = 0;
        int lowestNumberIndex = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > array[biggestNumberIndex]) { biggestNumberIndex = i; }
            if (array[i] < array[lowestNumberIndex]) { lowestNumberIndex = i; }
        }
        int temp = array[biggestNumberIndex];
        array[biggestNumberIndex] = array[lowestNumberIndex];
        array[lowestNumberIndex] = temp;

        PrintArray(array);
        PrintLine();
    }
    public void SecondTask(){
        int[] array = {2, 1, 0, 1, 2, 0, 1, 0, 2};
        int low = 0;
        int high = array.length - 1;
        int mid = 0, temp = 0;
        System.out.println("Original Array: ");
        PrintArray(array);
        while (mid <= high) {
            switch (array[mid]) {
                case 0: {
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = array[mid];
                    array[mid] = array[high];
                    array[high] = temp;
                    high--;
                    break;
                }
            }
        }
        System.out.println("\nSorted one: ");
        PrintArray(array);
        PrintLine();
    }
    public void ThirdTask(){
        double[] array = {1.5, -2.6, 3.7, -4.8, 5.9, -6.0, 7.1};

        double sumOfPositives = 0;
        for (double num : array) {
            if (num > 0) {
                sumOfPositives += num;
            }
        }
        System.out.println("Sum of positive elements: " + sumOfPositives);

        double maxAbs = Double.MIN_VALUE;
        double minAbs = Double.MAX_VALUE;
        for (double num : array) {
            double abs = Math.abs(num);
            if (abs > maxAbs) {
                maxAbs = abs;
            }
            if (abs < minAbs) {
                minAbs = abs;
            }
        }

        int maxIndex = -1;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) == maxAbs) {
                maxIndex = i;
            }
            if (Math.abs(array[i]) == minAbs) {
                minIndex = i;
            }
        }

        int start = Math.min(maxIndex, minIndex) + 1;
        int end = Math.max(maxIndex, minIndex) - 1;
        double product = 1;

        if (start <= end) {
            for (int i = start; i <= end; i++) {
                product *= array[i];
            }
        } else {
            product = 0;
        }
        System.out.println("Product of elements between max and min by absolute value: " + product);

        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.print("Array sorted in descending order: " + Arrays.toString(array));
        PrintLine();
    }
    public void ForthTask(){
        double[] array = {1.5, -2.6, 3.7, -4.8, 5.9, -6.0, 7.1, -8.2, 9.3};

        int minAbsIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(array[minAbsIndex])) {
                minAbsIndex = i;
            }
        }
        System.out.println("Index of minimum absolute value element: " + minAbsIndex);

        double sumAfterNegative = 0;
        boolean foundNegative = false;
        for (int i = 0; i < array.length; i++) {
            if (foundNegative) {
                sumAfterNegative += Math.abs(array[i]);
            }
            if (array[i] < 0) {
                foundNegative = true;
            }
        }
        System.out.println("Sum of absolute values of elements after the first negative element: " + sumAfterNegative);

        int newSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] >= -2 && array[i] <= 2)) {
                array[newSize] = array[i];
                newSize++;
            }
        }
        Arrays.fill(array, newSize, array.length, 0);
        System.out.print("Compressed array: " + Arrays.toString(Arrays.copyOf(array, newSize)));

        PrintLine();
    }
    public void FifthTask(){
        double[] array = {1.5, -2.6, 3.7, -4.8, 5.9, -6.0, 7.1, -8.2, 9.3};

        int maxAbsIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) > Math.abs(array[maxAbsIndex])) {
                maxAbsIndex = i;
            }
        }
        System.out.println("Index of maximum absolute value element: " + maxAbsIndex);

        double sumAfterPositive = 0;
        boolean foundPositive = false;
        for (int i = 0; i < array.length; i++) {
            if (foundPositive) {
                sumAfterPositive += array[i];
            }
            if (array[i] > 0) {
                foundPositive = true;
            }
        }
        System.out.println("Sum of elements after the first positive element: " + sumAfterPositive);

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && (int) array[left] >= -2 && (int) array[left] <= 2) {
                left++;
            }
            while (left < right && (int) array[right] < -2 || (int) array[right] > 2) {
                right--;
            }
            if (left < right) {
                double temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        System.out.print("Transformed array: " + java.util.Arrays.toString(array));

        PrintLine();
    }
    public void SixthTask(){
        double[] array = {1.5, -2.6, 3.7, -4.8, 5.9, -6.0, 7.1};

        int countGreaterThanThree = 0;
        for (double num : array) {
            if (num > 3) {
                countGreaterThanThree++;
            }
        }
        System.out.println("Number of elements greater than 3: " + countGreaterThanThree);

        double maxAbsElement = 0;
        int maxAbsIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i]) > Math.abs(maxAbsElement)) {
                maxAbsElement = array[i];
                maxAbsIndex = i;
            }
        }

        double product = 1;
        for (int i = maxAbsIndex + 1; i < array.length; i++) {
            product *= array[i];
        }
        System.out.print("Product of elements after maximum absolute value element: " + product);
        PrintLine();
    }
    public void SeventhTask(){
        int[] array = {3, -1, 0, -4, 2, -5, 6, 0, 8};

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            while (left < right && array[left] < 0) {
                left++;
            }
            while (left < right && array[right] >= 0) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        System.out.print("Transformed array: " + Arrays.toString(array));
        PrintLine();
    }
    public void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) { System.out.print(array[i] + " "); }

    }
    public void PrintLine(){
        System.out.println();
        for(int i = 0; i<45; i++){
            System.out.print('-');
        }
        System.out.println();
    }
}