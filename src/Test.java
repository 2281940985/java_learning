public class Test {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int[] newArray = reverse(new int[]{a, b});
        for(int val : newArray) {
            System.out.println(val);
        }
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        for(int i = 0; i < charArray.length; i++){
            char tmp = charArray[i];

            System.out.print(charArray[i]);
        }
        System.out.println('\r');
        System.out.println("a = " + a + ", b = " + b);
        String str = new String(charArray);
        System.out.println("字符串的哈希码为 :" + str.hashCode());
    }
    public static int[] reverse(int[] numarry) {
        for(int i = 0; i < numarry.length/2; i++){
            int temp = numarry[i];
            numarry[i] = numarry[numarry.length - i - 1];
            numarry[numarry.length - i - 1] = temp;

        }
        return numarry;
    }
}
