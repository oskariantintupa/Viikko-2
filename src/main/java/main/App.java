package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Car newCar = null;
        
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        System.out.print("Anna auton merkki: ");
        String brand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String model = sc.nextLine();
        
        newCar = new Car(brand, model, 0);

        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        newCar.printSpecs();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        newCar.setBrand(sc.nextLine());
                        System.out.print("Anna uusi auton malli: ");
                        newCar.setModel(sc.nextLine());

                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int accelerate = Integer.parseInt(sc.nextLine());
                        if (accelerate < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        newCar.accelerate(newCar.getSpeed() + accelerate);
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int decelerate = Integer.parseInt(sc.nextLine());
                        if (decelerate < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        else if (decelerate > newCar.getSpeed()) {
                            newCar.setSpeed(0);
                            break;
                        }
                        newCar.decelerate(newCar.getSpeed() - decelerate);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }
        }

        sc.close();

    }
}
