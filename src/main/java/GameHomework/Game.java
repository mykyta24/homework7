package GameHomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

    enum GameType {
        soccer,
        hockey,
        rugby;

    }


    public static void writeNumOfPlayersPerTeam(GameType game) {

        switch (game) {
            case soccer:
                File soccer = new File("soccer.txt");
                try {
                    soccer.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
                try {
                    FileWriter fileWriter = new FileWriter("soccer.txt");
                    fileWriter.write(" Валерий " +
                            "1\t Мирослав Зновенко\t20\t\t\tвратарь\n" +
                            "39\t Александр Сваток\t28\t185\t\tзащитник\n" +
                            "56\t Богдан Жинчин\t21\t\t\tзащитник\n" +
                            "24\t Валерий Лучкевич\t26\t176\t\tзащитник\n" +
                            "3\t Владимир Адамюк\t31\t\t\tзащитник\n" +
                            "6\t Габриэл Бузанелло\t24\t\t\tзащитник\n" +
                            "47\t Роман Вантух\t24\t\t\tзащитник\n" +
                            "51\t Сергей Заец\t21\t\t\tзащитник\n" +
                            "15\t Сергей Логинов\t32\t185\t76\tзащитник\n" +
                            "29\t Александр Назаренко");
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            case hockey:
                File hockey = new File("hockey.txt");
                try {
                    hockey.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
                try {
                    FileWriter fileWriter = new FileWriter("hockey.txt");
                    fileWriter.write("76\t Александр Пихаленок\t25\t\t\tполузащитник\n" +
                            "9\t Алексей Гуцуляк\t25\t184\t74\tполузащитник\n" +
                            "99\t  Билл\t23\t\t\tполузащитник\n" +
                            "57\t Данил Полонский\t21\t\t\tполузащитник\n" +
                            "8\t Игорь Когут\t26\t\t\tполузащитник\n" +
                            "55\t Кирилл Ховайко");
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case rugby:
                File rugby = new File("rugby.txt");
                try {
                    rugby.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
                try {
                    FileWriter fileWriter = new FileWriter("rugby.txt");
                    fileWriter.write("1\t Георгий Бущан\t28\t196\t94\tвратарь\n" +
                            "71\t Денис Бойко\t34\t191\t84\tвратарь\n" +
                            "74\t Денис Игнатенко\t19\t\t\tвратарь\n" +
                            "35\t Руслан Нещерет\t20\t\t\tвратарь\n" +
                            "20\t Александр Караваев\t30\t173\t69\tзащитник\n" +
                            "34\t Александр Сирота\t22\t189\t74\tзащитник\n" +
                            "24\t Александр Тымчик\t25\t180\t67\tзащитник\n" +
                            "3\t Антон Боль\t20\t\t\tзащитник\n" +
                            "44\t Владислав Дубинчак\t24\t\t\tзащитник\n" +
                            "4\t Денис Попов\t23\t\t\tзащитник\n" +
                            "25\t Илья Забарный\t20\t189\t81\tзащитник\n" +
                            "2\t Константин Вивчаренко\t20\t\t\tзащитник\n" +
                            "6\t Никита Бурда\t27\t187\t70\tзащитник\n" +
                            "21\t Никита Кравченко\t25\t\t\tзащитник\n" +
                            "94\t Томаш Кендзера\t28\t183\t78\tзащитник");
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }

    }


}






