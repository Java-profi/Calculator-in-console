
public class selectionString implements isNumeric {
    public static int numOne;
    public static int numTwo;
    public static char operand;
    public static boolean flag;

    public static void selection(String stroka) {
        char[] del = {'+', '-', '*', '/'};
        int index = 0;
        for (int i = 0; i < del.length; i++) {   //поиск индекса символа арифметической операции
            index = stroka.indexOf(del[i]);
            if (index != (-1)) {
                i = del.length;
                operand = stroka.charAt(index);
            }
        }

//проверим какой тип чисел в строке, для этого найдем тип символа с индексом 0
        String One = "0"; //строка второго числа
        String Two = "0"; //строка второго числа
        char charZero = stroka.charAt(0);
        if (isNumeric.Protected(charZero)) {   //если символ с индексом 0 - цифра(true), значит в строке арабские числа
            flag = true; //ставим флаг в false
            for (int i = 0; i != stroka.length(); ++i) {   //делим строку на группы символов
                if (i < index) {One += stroka.charAt(i);}
                if (i > index) {Two += stroka.charAt(i);}
            }
            numOne=Integer.parseInt(One);
            numTwo=Integer.parseInt(Two);

        }else {  //иначе в строке римские цифры
            flag = false; //ставим флаг в false
            for (int i = 0; i != stroka.length(); ++i) { //делим строку на группы символов
                if (i < index) {One += stroka.charAt(i);}
                if (i > index) {Two += stroka.charAt(i);}
            }
            numOne = to_Arabic.toArabic(One);
            numTwo = to_Arabic.toArabic(Two);
        }
    }
}

