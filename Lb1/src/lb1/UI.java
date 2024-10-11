package lb1;

import java.util.Scanner;

class UI {

    /*!
    проверяет символы в строке на принадлежность той группе символов в кодировке 
    ASCII, которая не соответствует алфавиту семеричной сс
    принимает на вход:
    \param[in] str - строка, введенная пользователем
    \param[out] - переменную типа boolean: 
    true - не соотвествует;
    false - соотвествует
     */
    public boolean isNotSeptenaryNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            if (digit < '0' || digit > '6') {
                return true;
            }
        }
        return false;
    }

    /*
    принимает введенные пользователем данные, создает объект класса Number,
    получает результат перевода введенного числа в 3сс и выводит его
     */
    public void run() {
        System.out.println("Приложение осуществляет перевод числа из семеричной \n"
                + "системы счисления в троичную. Доступен перевод только целых \n"
                + "положительных чисел. Для выхода используйте команду exit.\n"
                + "Выполнили: студенты группы 23ВП1 Бояринова Мария и Бычкова Надежда \n");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в семеричной системе счисления");
        String n = in.nextLine();
        while (!(n.equals("exit"))) {
            while (isNotSeptenaryNumber(n)) {
                System.out.println("Вы ввели не семеричное число, попробуйте еще раз");
                n = in.nextLine();
            }
            Number num = new Number(Integer.parseInt(n));
            System.out.println("Результат перевода этого числа в "
                    + "троичную систему счисления: " + num.convert());
            System.out.println("Введите число в семеричной системе счисления");
            n = in.nextLine();
        }
    }
}
