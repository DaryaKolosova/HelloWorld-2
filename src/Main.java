public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задание 2");

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задание 3");

        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);

        System.out.println("Задание 4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задание 5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задание 6");

        var OneBoxer = 78.2;
        System.out.println(OneBoxer);
        var TwoBoxer = 82.7;
        System.out.println(TwoBoxer);
        var sumWeight = OneBoxer + TwoBoxer;
        System.out.println("Общий вес боксеров составляет " + sumWeight + " кг");
        var differenceWeight = TwoBoxer - OneBoxer;
        System.out.println("Разница масс составляет " + differenceWeight + " кг!");

        System.out.println("Задание 7");

        var divisionWeight = TwoBoxer % OneBoxer;
        System.out.println("Разница в весе " + divisionWeight + " кг!");

        System.out.println("Задание 8");

        var totalHours = 640;
        var normHours = 8;
        var staff = totalHours / normHours;
        System.out.println(" Всего работников в компании " + staff );
        staff = staff + 94;
        var newHours = totalHours / staff;
        System.out.println("Если в компании работает " + staff + " человек, то всего " + newHours + " часа работы может быть поделено между сотрудниками.");
        }
    }
