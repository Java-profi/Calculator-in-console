//перевод в римские
public interface to_Roman {

    static String toRoman(int romanValue){
        String stroked=null;

        //первый вариант
  /*      if (romanValue==1) stroked ="I";
        if (romanValue==2) stroked ="II";
        if (romanValue==3) stroked ="III";
        if (romanValue==4) stroked ="IV";
        if (romanValue==5) stroked ="V";
        if (romanValue==6) stroked ="VI";
        if (romanValue==7) stroked ="VII";
        if (romanValue==8) stroked ="VIII";
        if (romanValue==9) stroked ="IX";
        if (romanValue==10) stroked ="X";
        if (romanValue==11) stroked ="XI";
        if (romanValue==12) stroked ="XII";
        if (romanValue==13) stroked ="XIII";
        if (romanValue==14) stroked ="XIV";
        if (romanValue==15) stroked ="XV";
        if (romanValue==16) stroked ="XVI";
        if (romanValue==17) stroked ="XVII";
        if (romanValue==18) stroked ="XVIII";
        if (romanValue==19) stroked ="XIX";
        if (romanValue==20) stroked ="XX";
        if (romanValue==21) stroked ="XXI";
        if (romanValue==22) stroked ="XXII";
        if (romanValue==23) stroked ="XXIII";
        if (romanValue==24) stroked ="XXIV";
        if (romanValue==25) stroked ="XXV";
        if (romanValue==26) stroked ="XXVI";
        if (romanValue==27) stroked ="XXVII";
        if (romanValue==28) stroked ="XXVIII";
        if (romanValue==29) stroked ="XXIX";
        if (romanValue==30) stroked ="XXX";
        if (romanValue==31) stroked ="XXXI";
        if (romanValue==32) stroked ="XXXII";
        if (romanValue==33) stroked ="XXXIII";
        if (romanValue==34) stroked ="XXXIV";
        if (romanValue==35) stroked ="XXXV";
        if (romanValue==36) stroked ="XXXVI";
        if (romanValue==37) stroked ="XXXVII";
        if (romanValue==38) stroked ="XXXVIII";
        if (romanValue==39) stroked ="XXXIX";
        if (romanValue==40) stroked ="XL";
        if (romanValue==41) stroked ="XLI";
        if (romanValue==42) stroked ="XLII";
        if (romanValue==43) stroked ="XLIII";
        if (romanValue==44) stroked ="XLIV";
        if (romanValue==45) stroked ="XLV";
        if (romanValue==46) stroked ="XLVI";
        if (romanValue==47) stroked ="XLVII";
        if (romanValue==48) stroked ="XLVIII";
        if (romanValue==49) stroked ="XLIX";
        if (romanValue==50) stroked ="L";
        if (romanValue==51) stroked ="LI";
        if (romanValue==52) stroked ="LII";
        if (romanValue==53) stroked ="LIII";
        if (romanValue==54) stroked ="LIV";
        if (romanValue==55) stroked ="LV";
        if (romanValue==56) stroked ="LVI";
        if (romanValue==57) stroked ="LVII";
        if (romanValue==58) stroked ="LVIII";
        if (romanValue==59) stroked ="LIX";
        if (romanValue==60) stroked ="LX";
        if (romanValue==61) stroked ="LXI";
        if (romanValue==62) stroked ="LXII";
        if (romanValue==63) stroked ="LXIII";
        if (romanValue==64) stroked ="LXIV";
        if (romanValue==65) stroked ="LXV";
        if (romanValue==66) stroked ="LXVI";
        if (romanValue==67) stroked ="LXVII";
        if (romanValue==68) stroked ="LXVIII";
        if (romanValue==69) stroked ="LXIX";
        if (romanValue==70) stroked ="LXX";
        if (romanValue==71) stroked ="LXXI";
        if (romanValue==72) stroked ="LXXII";
        if (romanValue==73) stroked ="LXXIII";
        if (romanValue==74) stroked ="LXXIV";
        if (romanValue==75) stroked ="LXXV";
        if (romanValue==76) stroked ="LXXVI";
        if (romanValue==77) stroked ="LXXVII";
        if (romanValue==78) stroked ="LXXVIII";
        if (romanValue==79) stroked ="LXXIX";
        if (romanValue==80) stroked ="LXXX";
        if (romanValue==81) stroked ="LXXXI";
        if (romanValue==82) stroked ="LXXXII";
        if (romanValue==83) stroked ="LXXXIII";
        if (romanValue==84) stroked ="LXXXIV";
        if (romanValue==85) stroked ="LXXXV";
        if (romanValue==86) stroked ="LXXXVI";
        if (romanValue==87) stroked ="LXXXVII";
        if (romanValue==88) stroked ="LXXXVIII";
        if (romanValue==89) stroked ="LXXXIX";
        if (romanValue==90) stroked ="XC";
        if (romanValue==91) stroked ="XCI";
        if (romanValue==92) stroked ="XCII";
        if (romanValue==93) stroked ="XCIII";
        if (romanValue==94) stroked ="XCIV";
        if (romanValue==95) stroked ="XCV";
        if (romanValue==96) stroked ="XCVI";
        if (romanValue==97) stroked ="XCVII";
        if (romanValue==98) stroked ="XCVIII";
        if (romanValue==99) stroked ="XCIX";
        if (romanValue==100) stroked ="C";
        /*

   */
        //второй вариант
        String[] mas={"I", "II","III","IV","V","VI","VII","VIII","IX"};
        String[] masDec={"X", "XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        if (romanValue<10) {stroked=mas[romanValue-1];}  //если больше 10, то делим на 10, выделяя модуль и остаток
        else {
            int remains=romanValue%10; //остаток от деления на 10
            int whole=romanValue/10;  //модуль от деления на 10
            switch (whole){
                case 1:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 2:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 3:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 4:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 5:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 6:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 7:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 8:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                case 9:
                    stroked=masDec[whole-1];
                    if (remains!=0)stroked+=mas[remains-1];
                    break;
                default: stroked=masDec[9];
            }
        }
        return stroked;
    }
}