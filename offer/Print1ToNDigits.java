package offer;

public class Print1ToNDigits {
    public void Print1ToN(int n) {
        if(n <= 0) {
            return;
        }
        char[] nums = new char[n];
        for(int i = 0; i < 10; ++i) {
            nums[0] = (char) (i + '0');
            recursive(nums, n, 0);
        }
    }
    private void recursive(char[] nums, int length, int index) {
        if(index == length - 1) {
            PrintNumber(nums);
            return;
        }
        for (int i = 0; i < 10; ++i) {
            nums[index + 1] = (char) (i + '0');
            recursive(nums, length, index + 1);
        }
    }
    private void PrintNumber(char[] numns) {
        boolean isBegin0 = true;
        int nLength = numns.length;
        System.out.println(nLength);
        for (int i = 0; i < nLength; ++i) {
            if(isBegin0 && numns[i] != '0')
                isBegin0 = false;
            if (!isBegin0) {
                System.out.print(numns[i]);
            }
        }
        System.out.print("\t");
    }
}
