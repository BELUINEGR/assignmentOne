public class Main {
    // 5 4 3 2 1
    public static int printNumber(int n) {
        System.out.printl(n);
        printNumber(n)
    }
        number = int(input("Enter a number: "))

        result = ''
        if number % 3 == 0 and number % 5 == 0:
        result = '+'
else:
        switcher = {
                number % 3 == 0: '-',
                number % 5 == 0: '-',
    }
        result = switcher.get(True, '!')

        print("Result:", result);

    }
    System.out.print("Example");

}