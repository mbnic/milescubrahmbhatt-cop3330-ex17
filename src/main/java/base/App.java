package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        Drinker person = new Drinker();

        myApp.getInfo(person);
        double BAC = myApp.calculateBAC(person);
    }

    public double calculateBAC(Drinker person) {

        double test = ((person.ouncesDrank * 5.14)/(person.bodyWeight * .73));
        // -
        double test2 = (.015 * person.hoursSince);

        double test3 = test - test2;

        double bac = ((person.ouncesDrank * 5.14) / (person.bodyWeight * .73)) - (.015 * person.hoursSince);

        System.out.printf("%f", test3);

        return bac;
    }

    public void getInfo(Drinker person) {
        System.out.printf("Enter a 1 if you are male or a 2 if you are female: ");
        person.gender = Integer.parseInt(in.nextLine());

        System.out.printf("How many ounces of alcohol did you have? ");
        person.ouncesDrank = Float.parseFloat(in.nextLine());

        System.out.printf("What is your weight, in pounds? ");
        person.bodyWeight = Float.parseFloat(in.nextLine());

        System.out.printf("How many hours has it been since your last drink? ");
        person.hoursSince = Float.parseFloat(in.nextLine());
    }

}
