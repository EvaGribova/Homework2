public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран


        int ticketPrice = 1000;
        int costOneMile = 20;
        int bonusMile;

        System.out.println("Начисленно бонусных миль = " + (bonusMile = ticketPrice / costOneMile));
    }
}