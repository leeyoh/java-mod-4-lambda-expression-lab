import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;
        OddNumber nextOddNum = (number) -> {
            if(number % 2 == 0) return number + 1;
            return number + 2;
        };
        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}

@FunctionalInterface
interface OddNumber{
    int applyAsInt(int num);
}

