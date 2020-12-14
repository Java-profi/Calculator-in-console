//ввод значений
/*import java.util.Scanner;
public class Numbers implements isNumeric, to_Arabic, Calculation {

 //   static Scanner scanner = new Scanner(System.in);
    static boolean flag;
    static int numbr,num;

    public static int getNum(String number){
     //   String number = scanner.nextLine();
        if (isNumeric.Protected(number)) { //проверка тип введенных символов
            flag =true; //true-Arabic symbols, false-Roman symbols
            numbr=Integer.parseInt(number); //если да, то парсим строку в Integer
            int[]nums={1,2,3,4,5,6,7,8,9,10};
            for (int i=0;i<nums.length;i++){ //проверка на входимость в диапазон 1...10
                if (numbr==nums[i]) num=numbr;
            }
        }else {

            String str = number.toUpperCase(); //если нет,то переводим буквы в строчные и конвертируем в арабские
            numbr=to_Arabic.toArabic(str);
            num=numbr;
        }
        return num;
    }
}
}
 */