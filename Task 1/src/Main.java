import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество Жабьих глаз:");
        int toadEyesCount = scanner.nextInt();

        System.out.println("Введите количество Слез вурдалака:");
        int ghoulTearsCount = scanner.nextInt();

        System.out.println("Введите количество Костей ворона:");
        int ravenBonesCount = scanner.nextInt();

        System.out.println("Введите количество Пельменей:");
        int dumplingsCount = scanner.nextInt();

        if ((toadEyesCount >= 3 && ravenBonesCount >= 1) ||
                (ravenBonesCount >= 2 && dumplingsCount >= 4) ||
                (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) ||
                (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3)) {
            System.out.println("Вы можете приготовить следующие эликсиры:");
            if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                System.out.println("- Эликсир зоркости");
            }
            if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
                System.out.println("- Эликсир стойкости");
            }
            if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                System.out.println("- Эликсир скрытности");
            }
            if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                System.out.println("- Запретный эликсир");
            }
        } else {
            System.out.println("У вас недостаточно ингредиентов для приготовления эликсиров.");
        }
    }
}

