package offer;

import java.util.Stack;

public class StackOrder {
    public static boolean isPopOder(int[] pushA, int[] popA) {
        boolean bPossible = false;
        if (pushA != null && popA != null && pushA.length > 0) {
            int pushL = 0, nextPush = 0;
            int popL = 0, nextPop = 0;
            Stack<Integer> stk = new Stack<>();
            while (nextPop - popL < popA.length) {
                while (stk.isEmpty() || stk.peek() != popA[nextPop]) {
                    if (nextPush - pushL == pushA.length) {
                        break;
                    }
                    stk.push(pushA[nextPush]);
                    nextPush++;
                }
                if (stk.peek() != popA[nextPop]) {
                    break;
                }
                stk.pop();
                nextPop++;
            }
            if (stk.isEmpty() && nextPop - popL == popA.length) {
                bPossible = true;
            }
        }
        return bPossible;
    }
    public static void  main(String[] args) {
        int[] push = { 1, 2, 3, 4, 5 };
        int[] pop = { 3, 5, 4, 2, 1 };
        boolean b = isPopOder(push, pop);
        System.out.println(b);
    }
}
