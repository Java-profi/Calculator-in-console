//перевод в арабские
public interface to_Arabic {

    static int toArabic(String numString) {
        int arabicValue=0;
        numString=numString.toUpperCase();
        if (numString.equals("0I")) arabicValue =1;
        if (numString.equals("0II")) arabicValue =2;
        if (numString.equals("0III")) arabicValue =3;
        if (numString.equals("0IV")) arabicValue =4;
        if (numString.equals("0V")) arabicValue =5;
        if (numString.equals("0VI")) arabicValue =6;
        if (numString.equals("0VII")) arabicValue =7;
        if (numString.equals("0VIII")) arabicValue =8;
        if (numString.equals("0IX")) arabicValue =9;
        if (numString.equals("0X")) {arabicValue =10;
        }
        return arabicValue;
    }
}