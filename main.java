public class main {
    public static void main(String [] args) {
        int [] nums = {2,3,4,5,6,7,8,9,10};
        int mult = 1;
        for (int i = 0; i<9; i++) {
            mult *=nums[i];


        }
        System.out.println(mult);
    }
}
