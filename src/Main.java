public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var massFirst = 78.2;
        System.out.println("масса первого боксера " + massFirst + " кг.");
        var massSecond = 82.7;
        System.out.println("масса второго боксера " + massSecond + " кг.");
        var totalMass = massFirst + massSecond;
        System.out.println("общая масса боксеров " + totalMass + " кг.");
        var massDifference = massFirst - massSecond;
        System.out.println( "разница в весе на " + massDifference + " кг.");
        var massDifferenceCorrect = massSecond % massFirst;
        System.out.println("остаток от деления составляет " + massDifferenceCorrect + " кг.");

        var x = 640;
        var y = 8;
        var result = x / y;
        System.out.println("Всего работников в компании - " + result + " человек.");

        var a = 80;
        var b = 94;
        var c = a+b;
        var d = 8;
        var result2 = c * d;
        System.out.println("Если в компании работает " + c + " человека, то всего " + result2 + " часов работы может быть поделено между сотрудниками.");






    }
}