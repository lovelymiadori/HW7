import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanMake = false;


        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        System.out.println("Введите количество жабьих глаз:");
        Scanner scanner = new Scanner(System.in);
        toadEyesCount += scanner.nextInt();

        System.out.println("Введите количество слез вурдалака:");
        ghoulTearsCount += scanner.nextInt();

        System.out.println("Введите количество костей ворона:");
        ravenBonesCount += scanner.nextInt();

        System.out.println("Введите количество пельменей:");
        dumplingsCount += scanner.nextInt();

        //todo дописать логику программы сюда

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить эликсир зоркости, использовав следующие ингридиенты: 3 Жабьих глаза + 1 кость ворона.");
            isCanMake = true;
        }

        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можете приготовить эликсир стойкости, использовав следующие ингридиенты: 2 кости ворона + 4 пельменя.");
            isCanMake = true;
        }

        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир скрытности, использовав следующие ингридиенты: 7 слез вурдалака + 1 пельмень + 2 жабьих глаза.");
            isCanMake = true;
        }

        if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можете приготовить запретный эликсир, использовав следующие ингридиенты: 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона.");
            isCanMake = true;
        }

        if (!isCanMake) {
            System.out.println("У вас недостаточно ингредиентов для создания элексира");
        }

    }
}
