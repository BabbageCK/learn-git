package offer;

public class offer {
    public int digitAtIndex(int index) {
        if(index < 0)
            return -1;
        int digits = 1;
        while(true) {
            int numbers = countOfIntegers(digits);
            if(index < numbers * digits)
                return digitAtIndex(index, digits);
            index -= numbers * digits;
            digits++;
        }
    }
    //返回拥有digits位数的整数数量
    private int countOfIntegers(int digits) {
        if (digits == 1)
            return 10;
        int cnt = (int)Math.pow(10, digits - 1);
        return 9 * cnt;
    }
    private int digitAtIndex(int index, int digits) {
        //确定该索引是哪个数
        int number = beginNumber(digits) + index / digits;
        //确定哪一位
        int indexFromRight = digits - index % digits;
        for (int i = 1; i <indexFromRight; i++) {//i from 1 not 0
            number /= 10;
        }
        return number % 10;
    }
    private int beginNumber(int digits) {
        if (digits == 1)
            return 0;
        return (int)Math.pow(10, digits - 1);

    }

}
