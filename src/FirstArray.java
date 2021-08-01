public class FirstArray {
    public static void main(String[] args) {
        int[] nums = new int[1000];
               for (int i=100; i < nums.length; i++) {
                   nums[i] =i +100;
               }
            for (int i =100; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
    }


