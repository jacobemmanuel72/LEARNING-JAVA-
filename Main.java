public class Main {

    public static void main(String[] args) {
        int nums[] = {9, 27, 80, 90, 50, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        // int nums[] = {9, 27, 80, 90, 50, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        // int nums[] = {9, 27, 80, 90, 50, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        // int nums[] = {9, 27, 80, 90, 50, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        // int nums[] = {9, 27, 80, 90, 50, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        int size = nums.length;
        int temp = 0;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(nums + " ");
        }

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (nums[i] > nums[j]) {

                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.println();
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}