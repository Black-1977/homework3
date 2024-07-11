public class Main {
    public static void main(String[] args) {
        // Part 1 + Part 2
        System.out.println("Задачи 1 и 2");
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        f=27.12f;
        l=987678965549L;
        d=2.786;
        s=569;
        short s1=-159;
        i=27897;
        b=67;
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной s с типом short равно "+s);
        System.out.println("Значение переменной i с типом int равно "+i);
        System.out.println("Значение переменной l с типом long равно "+l);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной d с типом double равно "+d);
        System.out.println("Значение переменной s1 с типом short равно "+s1);
        System.out.println();

        // Part 3
        System.out.println("Задача 3");
        byte teacher1=23;
        byte teacher2=27;
        byte teacher3=30;
        int paper=480;
        int count=paper/(teacher1+teacher2+teacher3);
        System.out.println("На каждого ученика рассчитано "+count+" листов бумаги");
        System.out.println();

        // Part 4
        System.out.println("Задача 4");
        short bottlesPerMin=16/2;
        int min20=20;
        int day1=24*60;
        int day3=3*24*60;
        int month1=30*24*60;
        count=bottlesPerMin*min20;
        System.out.println("За 20 минут машина произвела "+count+" штук бутылок");
        count=bottlesPerMin*day1;
        System.out.println("За сутки машина произвела "+count+" штук бутылок");
        count=bottlesPerMin*day3;
        System.out.println("За 3 дня машина произвела "+count+" штук бутылок");
        count=bottlesPerMin*month1;
        System.out.println("За месяц машина произвела "+count+" штук бутылок");
        System.out.println();

        // Part 5
        System.out.println("Задача 5");
        int sumTins=120;
        int classes;
        byte whitePerClass=2;
        byte brownPerClass=4;
        classes=sumTins/(whitePerClass+brownPerClass);
        System.out.println("В школе, где "+classes+" классов, нужно "+classes*whitePerClass+" банок белой краски и "
                +classes*brownPerClass+" банок коричневой краски");
        System.out.println();

        // Part 6
        System.out.println("Задача 6");
        byte quantBanan=5;
        short weightBanan=80;
        byte quantMilk=200/100;
        short weightMilk=105;
        byte quantIcecream=2;
        short weightIcecream=100;
        byte quantEgg=4;
        short weightEgg=70;
        int weightKoktail;
        weightKoktail=quantBanan*weightBanan+quantMilk*weightMilk+quantIcecream*weightIcecream+quantEgg*weightEgg;
        System.out.println("Вес спортивного завтрака "+weightKoktail+" грамм или "+(float)weightKoktail/1000+" кг");
        System.out.println();

        // Part 7
        System.out.println("Задача 7");
        int sumWeight=7*1000;
        short minWeight=250;
        short maxWeight=500;
        int minDays, maxDays, averageDays;
        minDays=sumWeight/maxWeight;
        maxDays=sumWeight/minWeight;
        averageDays=(minDays+maxDays)/2;
        System.out.println("Для похудения на "+sumWeight/1000+" кг потребуется от "+minDays+" до "+maxDays+" дней, " +
                "в среднем "+averageDays+".");
        System.out.println();

        // Part 8
        System.out.println("Задача 8");
        int masha=67760, denis=83690, kristina=76230;
        int mashaNew, denisNew, kristinaNew;
        mashaNew=(int)(masha*1.1);
        denisNew=(int)(denis*1.1);
        kristinaNew=(int)(kristina*1.1);
        count=(mashaNew-masha)*12;
        System.out.println("Маша сейчас получает "+mashaNew+" рублей. Годовой доход вырос на "+count+" рублей.");
        count=(denisNew-denis)*12;
        System.out.println("Денис сейчас получает "+denisNew+" рублей. Годовой доход вырос на "+count+" рублей.");
        count=(kristinaNew-kristina)*12;
        System.out.println("Кристина сейчас получает "+kristinaNew+" рублей. Годовой доход вырос на "+count+" рублей.");
        System.out.println();
    }
}