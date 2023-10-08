public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собаки " + dog + " Кошки " + cat + " Перец " + paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Теперь собак " + dog + " Кошек " +  cat + " Перца " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Теперь собак " + dog + " Кошек " + cat + " Перца " + paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var totalWeight = firstFighterWeight + secondFighterWeight;
        System.out.println("Общая масса бойцов " + totalWeight + " кг!");
        var massDifference = secondFighterWeight - firstFighterWeight;
        System.out.println("Разница массы бойцов " + massDifference + " кг!");
        massDifference = secondFighterWeight % firstFighterWeight;
        System.out.println("Разница массы бойцов " + massDifference + " кг!");

        var allTime = 640;
        var timeJob = 8;
        var employees = allTime / timeJob;
        System.out.println("Всего работников в компании " + employees + " человек");

        var newEmployees = employees + 94;
        System.out.println(newEmployees);
        var newTime = timeJob * newEmployees;
        System.out.println("Если в компании работает " + newEmployees + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");





    }
}