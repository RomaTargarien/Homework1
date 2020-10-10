package Hometask4.Stroki;

public class Number {

    public String toString(String number) {
        String numberStroka = "";
        try {
            int num = Integer.parseInt(number);
            if (num == 0) {
                return "ноль";
            }
            if (num < 0) {
                numberStroka = "минус " + return1till10(-num);
            } else {
                numberStroka = return1till10(num);
            }
            return numberStroka;
        } catch (Exception e){
            double num2  = (Double.parseDouble(number))*100;
            int number2int = ((int) num2/100)*100 ;
            int num = (int)((num2  - number2int));
            if (number2int/100 == 0){
                return "ноль";
            }
            if (number2int/100 > 0){
                numberStroka = return1till10(number2int/100) + " целых " + sotaya(num);
            }
            else {
                numberStroka = "минус " + return1till10(-number2int/100) + " целых " + sotaya(-num);
            }
        }
        return numberStroka;
    }

    private String return1till10(int number) {
        if (number > 0 && number < 10) {
            switch (number) {
                case 1:
                    return "один";
                case 2:
                    return "два";
                case 3:
                    return "три";
                case 4:
                    return "четыре";
                case 5:
                    return "пять";
                case 6:
                    return "шесть";
                case 7:
                    return "семь";
                case 8:
                    return "восемь";
                case 9:
                    return "девять";
            }
        }
        if (number > 10 && number <= 19) {
            switch (number) {
                case 11:
                    return "одиннадцать";
                case 12:
                    return "двенадцать";
                case 13:
                    return "тринадцать";
                case 14:
                    return "четырнадцать";
                case 15:
                    return "пятнадцать";
                case 16:
                    return "шестнадцать";
                case 17:
                    return "семнадцать";
                case 18:
                    return "восемнадцать";
                case 19:
                    return "девятнадцать";
            }
        }
        if (number >= 10 && number <= 100 && number % 10 == 0) {
            return returnDes(number);
        }
        if (number >= 21 && number < 100) {
            return returnDes(number - number % 10) + " " + return1till10(number % 10);
        }
        if (number >= 100 && number <= 900 && number % 100 == 0) {
            return returnSot(number);
        }
        if (number > 100 && number <= 999) {
                return returnSot(number - number % 100) + " " + return1till10(number % 100);
        }
        if (number >= 1000 && number < 10000 && number % 1000 == 0) {
            return returnThousand(number);
        }
        if (number > 1000 && number <= 9999) {
            return returnThousand(number) + " " + return1till10(number % 1000);
        }
        if (number >= 10000 && number < 100000 && number % 10000 == 0){
            return return1till10(number / 1000) + " тысяч";
        }
        if (number >= 10000 && number < 100000){
            return returnTenThousands(number) + " " + return1till10(number % 1000);
        }
        if (number >= 100000 && number <= 999999 && number % 1000 == 0){
            return return1till10(number/1000) + " тысяч";
        }
        if (number > 100000 && number <= 999999){
            return returnSotThousands(number) + " " + return1till10(number % 1000);
        }
        if (number >= 1000000 && number <= 999999999 && number % 1000000 == 0){
            return returnMillion(number);
        }
        if (number >= 1000000 && number <= 999999999){
            return returnMillion(number) + return1till10(number % 1000000);
        }
        return null;
    }

    private String returnDes(int number) {
        switch (number) {
            case 10:
                return "десять";
            case 20:
                return "двадцать";
            case 30:
                return "тридцать";
            case 40:
                return "сорок";
            case 50:
                return "пятьдесят";
            case 60:
                return "шестьдесят";
            case 70:
                return "семьдесят";
            case 80:
                return "восемьдесят";
            case 90:
                return "девяноста";
            case 100:
                return "сто";
        }
        return null;
    }

    private String returnSot(int number) {
        switch (number) {
            case 100:
                return "сто";
            case 200:
                return "двести";
            case 300:
                return "триста";
            case 400:
                return "четыреста";
            default:
                return return1till10(number / 100) + "сот";
        }
    }

    private String returnThousand(int number) {
        switch (number / 1000) {
            case 1:
                return "одна тысяча";
            case 2:
                return "две тысячи";
            case 3:
                return "три тысячи";
            case 4:
                return "четыре тысячи";
            default:
                return return1till10(number / 1000) + " тысяч";
        }
    }

    private String returnTenThousands(int number){
        for (int i = 21; i <= 91; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 1) + " одна тысяча ";
            }
        }
        for (int i = 22; i <= 92; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 2) + " две тысячи ";
            }
        }
        for (int i = 23; i <= 93; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 3) + " три тысячи ";
            }
        }
        for (int i = 24; i <= 94; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 4) + " четыре тысячи ";
            }
        }
        return return1till10(number / 1000) + " тысяч";
    }

    private String returnSotThousands(int number){
        for (int i = 101; i <= 991; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 1) + " одна тысяча ";
            }
        }
        for (int i = 102; i <= 992; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 2) + " две тысячи ";
            }
        }
        for (int i = 103; i <= 993; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 3) + " три тысячи ";
            }
        }
        for (int i = 104; i <= 994; i = i + 10) {
            if (number / 1000 == i){
                return return1till10(i - 4) + " четыре тысячи ";
            }
        }
        return return1till10(number/1000 ) + " тысяч";
    }

    private String returnMillion(int number){
        for (int i = 2; i < 992; i = i + 10){
            if (number / 1000000 == i) {
                return return1till10(i) + " миллиона ";
            }
        }
        for (int i = 3; i < 993; i = i + 10){
            if (number / 1000000 == i) {
                return return1till10(i) + " миллиона ";
            }
        }
        for (int i = 4; i < 994; i = i + 10){
            if (number / 1000000 == i) {
                return return1till10(i) + " миллиона ";
            }
        }
        for (int i = 1; i < 991; i = i + 10){
            if (number / 1000000 == i) {
                return return1till10(i) + " миллион ";
            }
        }
        return return1till10(number/1000000) + " миллионов ";
    }

    private String sotaya(int number){
        if (number == 1){
            return "одна сотая";
        }
        for (int i = 21; i <= 91; i = i + 10){
            if (number == i){
                return returnDes(i -1 ) + " одна сотая";
            }
        }
        return return1till10(number) + " сотых";
    }
}

