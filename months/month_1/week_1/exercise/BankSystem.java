package months.month_1.week_1.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: 银行管理系统
 * 要求在控制台选择操作 1.添加用户 2.忘记密码 3.查看所有账户
 * 账户类具有的字段：姓名，账号（需自动生成 格式为Bank 001……） 密码（查看所有账户的时候需显示对应密码个数的*）手机号码（根据手机号码来找回密码）
 * 1.添加用户
 * 选择添加用户，需录入姓名，密码，手机号，添加成功返回账号给用户。
 * 2.忘记密码
 * 需用户输入账号，姓名，手机号码 均相同才可以显示密码 返回真实密码给用户
 * 3.查看所有账户
 * 只显示姓名和账号（不显示其他）
 * @author: acn
 * @date: 2023/09/06/11:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
class Account {
    private static int accountCounter = 1;
    private String name;
    private String accountNumber;
    private String password;
    private String phoneNumber;

    public Account(String name, String password, String phoneNumber) {
        this.name = name;
        this.accountNumber = creatAccountNumber();
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 生成账号数
     * @return String
     */
    private String creatAccountNumber() {
        String s = String.format("%03d", accountCounter);
        accountCounter++;
        return "Bank " + s;
    }

    /**
     * 验证账户
     * @param nameToCheck
     * @param phoneNumberToCheck
     * @return boolean
     */
    public boolean verifyAccount(String nameToCheck, String phoneNumberToCheck) {
        return nameToCheck.equals(name) && phoneNumberToCheck.equals(phoneNumber);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("1.添加用户 2.忘记密码 3.查看所有账户 4.退出系统");
            int in = scanner.nextInt();
            scanner.nextLine();
            switch (in) {
                case 1:
                    System.out.print("请输入姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("请输入密码: ");
                    String password = scanner.nextLine();
                    System.out.print("请输入手机号码: ");
                    String phoneNumber = scanner.nextLine();

                    Account newAccount = new Account(name, password, phoneNumber);
                    accounts.add(newAccount);
                    System.out.println("添加成功，您的账号是: " + newAccount.getAccountNumber());
                    break;

                case 2:
                    System.out.print("请输入账号: ");
                    String accountToCheck = scanner.nextLine();
                    System.out.print("请输入姓名: ");
                    String nameToCheck = scanner.nextLine();
                    System.out.print("请输入手机号码: ");
                    String phoneNumberToCheck = scanner.nextLine();

                    boolean accountFound = false;
                    Iterator<Account> accountIterator = accounts.iterator();
                    while (accountIterator.hasNext()) {
                        if (accountIterator.next().getAccountNumber().equals(accountToCheck) &&
                                accountIterator.next().verifyAccount(nameToCheck, phoneNumberToCheck)) {
                            System.out.println("密码: " + accountIterator.next().getPassword());
                            accountFound = true;
                            break;
                        }
                    }

                    if (!accountFound) {
                        System.out.println("账户或密码出错");
                    }
                    break;

                case 3:
                    System.out.println("所有账户信息:");
                    for (Account account : accounts) {
                        System.out.println("姓名: " + account.getName() + ", 账号: " + account.getAccountNumber());
                    }
                    break;

                case 4:
                    System.out.println("退出系统");
                    break;

                default:
                    System.out.println("请重新选择");
                    break;
            }
        }
    }
}


