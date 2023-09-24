package months.month_1.week_2.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

/**
 * @Description: 1.添加联系人
 * 2.显示联系人
 * 3.删除联系人
 * 4.查找联系人
 * 5.修改联系人
 * 6.清空联系人
 * 7.存储联系人
 * 8.读取联系人
 * 9.联系人排序
 * 0.退出通讯录
 * @author: acn
 * @date: 2023/09/14/10:29
 */
public class AddressBook {
    public static Scanner scanner = new Scanner(System.in);

    @Data
    @AllArgsConstructor
    static class Person {
        private String name;
        private String number;

        @Override
        public String toString() {
            return "联系人" +
                    "姓名='" + name + '\'' +
                    ", 号码='" + number + '\'';
        }

    }

    static class PersonManager {
        public static TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.parseInt(o1.number) - Integer.parseInt(o2.number);
            }
        });

        public static void addPerson() {
            String name;
            String num;
            System.out.println("输入联系人姓名");
            name = scanner.next();
            System.out.println("输入联系人号码");
            num = scanner.next();
            persons.add(new Person(name, num));
        }

        public static void printPerson() {
            for (Person person : persons) {
                System.out.println(person);
            }
        }

        public static void deletePerson() {
            System.out.println("输入联系人姓名以删除");
            String name = scanner.next();
            for (Person person : persons) {
                if (person.name.equals(name)) {
                    persons.remove(person);
                }
            }
        }

        public static void findPerson() {
            System.out.println("输入联系人姓名以查找");
            String name = scanner.next();
            for (Person person : persons) {
                if (person.name.equals(name)) {
                    System.out.println(person);
                }
            }
        }

        public static void updatePerson() {
            System.out.println("输入联系人姓名以修改");
            String name = scanner.next();
            for (Person person : persons) {
                if (person.name.equals(name)) {
                    System.out.println("输入联系人姓名");
                    name = scanner.next();
                    System.out.println("输入联系人号码");
                    String num = scanner.next();
                    persons.add(new Person(name, num));
                }
            }
        }

        public static void removeAllPersons() {
            persons = new TreeSet<>(Comparator.comparingInt(o -> Integer.parseInt(o.number)));
        }

        public static void sortPersonByNumber() {

        }

        public static void printAllPersons() {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }


    public static void printMenu() {
        System.out.println("------------------\n1.添加联系人\n" +
                "2.显示联系人\n" +
                "3.删除联系人\n" +
                "4.查找联系人\n" +
                "5.修改联系人\n" +
                "6.清空联系人\n" +
                "7.存储联系人\n" +
                "8.读取联系人\n" +
                "9.联系人排序\n" +
                "0.退出通讯录\n------------------");
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            printMenu();
            System.out.println("请输入功能编号：");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    PersonManager.addPerson();
                    break;
                case 2:
                    PersonManager.printPerson();
                    break;
                case 3:
                    PersonManager.deletePerson();
                    break;
                case 4:
                    PersonManager.findPerson();
                    break;
                case 5:
                    PersonManager.updatePerson();
                    break;
                case 6:
                    PersonManager.removeAllPersons();
                    break;
                case 7:
//???
                    break;
                case 8:
                    PersonManager.printAllPersons();
                    break;
                case 9:
                    PersonManager.sortPersonByNumber();
                    break;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("输入有误\n");
            }
        }
    }


}
