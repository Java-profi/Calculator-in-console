public interface Calculation {

    static String calc(int num1, int num2, char operation) {

        int res=0;
        String str;

        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
             //   calc(num1, num2, Operations.getOperation());//рекурсия
        }
       str=Integer.toString(res);
       return str;
    }
}