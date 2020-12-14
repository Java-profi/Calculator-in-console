import java.util.Scanner;

public class Calculator extends selectionString implements Calculation, Operations, to_Roman {

    public static void main(String[] args) {

        System.out.println("Ввод:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        selectionString.selection(input);
        int numLineOne = selectionString.numOne;
        int numLineTwo = selectionString.numTwo;
        char operationLine = selectionString.operand;
        System.out.println("Вывод:");

        String result = Calculation.calc(numLineOne, numLineTwo, operationLine);

        if (flag) {System.out.println(result);//если флаг есть, то выводим арабскими символами, если нет-то римскими
        }else{
            int num=Integer.parseInt(result);//парсим result в тип Integer
            String res=to_Roman.toRoman(num);//перевод в римские
        System.out.println(res);
        }
    }
}
//That is program loaded from Intellij Idea JDK version 15.0.1