import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistributionOfBoxes {
    public static void main(String[] args) throws IOException {

        int maxCountContainersInTruck = 12;
        int maxCountBoxesInContainer = 27;
        int countBoxes = 1;
        int countContainers = 1;
        int countTrucks;

        System.out.println("Введите количество ящиков: ");
        int namberBoxes = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());

        for (countTrucks = 1; countBoxes <= namberBoxes; countTrucks++){
            System.out.println("\n\nГрузовик " + countTrucks + ":");
            for (int containersInTruck = 1; (countBoxes <= namberBoxes)&&(containersInTruck <= maxCountContainersInTruck); containersInTruck++, countContainers++){
                System.out.println("\n\tКонтейнер " + countContainers + ":");
                for ( int boxesInContainer = 1;(boxesInContainer <= maxCountBoxesInContainer)&&(countBoxes <= namberBoxes); boxesInContainer++, countBoxes++){
                    System.out.println("\tЯщик " + countBoxes);
                }
            }
        }

        System.out.println("Вам потребуется: \n" + "Грузовиков: " + countTrucks + "\nКонтейнеров: " + countContainers);
    }
}
