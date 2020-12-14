//проверяем это число или символ?
public interface isNumeric {
    static boolean Protected(char c){
     /*   try {
            int i=Integer.parseInt(char.valueOf(c));
        }catch (NumberFormatException|NullPointerException nfe){
            return false;
        }
        return true;*/
        return Character.isDigit(c);
    }
}