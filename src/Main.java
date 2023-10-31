import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int sugar = 500;
        System.out.println("Значение переменной sugar с типом int равно " + sugar);
        byte apple = 100;
        System.out.println("Значение переменной apple с типом byte равно "+ apple);
        short day = 20;
        System.out.println("Значение переменной day с типом short равно " + day);
        long distance = 10000;
        System.out.println("Значение переменной distance с типом long равно " + distance);
        float bananas = 11.9F;
        System.out.println("Значение переменной bananas с типом float равно " + bananas);
        double orange = 15.8F;
        System.out.println("Значение переменной orange с типом double равно " + orange);


        float apples = 27.2F;
        System.out.println("Яблок " + apples + " кг");
        long distances = 987678965549L;
        System.out.println("Дистанция в см равна " + distances + " см");
        double cookies = 2.786F;
        System.out.println("Вес печенья " + cookies + " кг");
        short way = 569;
        System.out.println("Осталось " + way + " км");
        short answer = -159;
        System.out.println("Ответ задачи " + answer);
        int human = 27897;
        System.out.println("Человек в зданни " + human);
        byte papper = 67;
        System.out.println("Перца осталось " + papper + " кг");

        byte Ludmila = 23;
        byte Anna = 27;
        byte Ekaterina = 30;
        short papers = 480;
        int students = Ludmila + Anna + Ekaterina;
        int paper = papers / students;
        System.out.println("На каждого ученика рассчитано " + paper + " листков бумаги");


        byte bottles = 16;
        byte time = 2;
        int one = bottles * 10;
        System.out.println("За 20 минут машина произвела " + one + " штук бутылок");
        int two = bottles * 1440 / 2;
        System.out.println("За сутки машина произвела " + two + " штук бутылок");
        int three = two * 3;
        System.out.println("За трое суток машина произвела " +  three + " штук бутылок");
        int month = three * 10;
        System.out.println("За месяц машина произвела "  + month + " штук бутылок");


        byte all = 120;
        System.out.println("Всего банок " + all + " штук");
        byte white = 2;
        System.out.println("Белой краски необходимо на один класс " + white + " банок");
        byte brown = 4;
        System.out.println("Коричневой краски необходимо на один класс " + brown + " банок");
        int pot = white + brown;
        System.out.println("Всего банок краски уходит на один класс " + pot + " штук");
        int classes = all / pot;
        System.out.println("Классов всего " + classes);
        int allWhite = white * classes;
        int allBrown = brown * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");


        byte banana = 5;
        byte bananaG = 80;
        short milk = 200;
        byte milkG = 105;
        byte icecream = 2;
        byte icecreamG = 100;
        byte eggs = 4;
        byte eggsG = 70;
        int allG = banana * bananaG + milkG * 2 + icecream  * icecreamG + eggs* eggsG;
        System.out.printf("Всего грамм в порции " + allG + " грамм");
        int perKg = 1000;
        double allKg = allG / (float)perKg;
        System.out.println(" Всего килограмм в порции " + allKg + " кг");


        byte purpose = 7;
        short oneIssue = 250;
        short twoIssue = 500;
        int purposeG = 7 * 1000;
        int oneDay = purposeG / oneIssue;
        int twoDay = purposeG / twoIssue;
        System.out.println("При похуденни в день на " + oneIssue + " грамм в день, уйдет " + oneDay + " дней, а при похудении на " + twoIssue + " грамм в день, уйдет " + twoDay + " дней");



        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int yearMasha = Masha * 12;
        int yearDenis = Denis * 12;
        int yearKristina = Kristina * 12;
        double newMasha = (Masha * 0.1)  + Masha;
        double newDenis = (Denis * 0.1) + Denis;
        double newKristina = (Kristina * 0.1) + Kristina;
        double yearNewMasha = newMasha * 12;
        double yearNewDenis = newDenis * 12;
        double yearNewKristina= newKristina * 12;
        double differenceMasha = yearNewMasha - yearMasha;
        double differenceDenis = yearNewDenis - yearDenis;
        double differenceKristina = yearNewKristina - yearKristina;
        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");







    }
}