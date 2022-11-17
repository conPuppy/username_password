import manager.ManagerAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerAccount managerAccount = new ManagerAccount();

        while(true) {
            System.out.println("1. Đăng nhập ");
            System.out.println("2. Đăng ký");
            System.out.println("3. Đổi mật khẩu");
            System.out.println("4. Hiển thị tài khoản");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập username: ");
                    String name = scanner.nextLine();
                    if(managerAccount.checkUsername(name)) {
                        System.out.println("Nhập password:");
                        String pass = scanner.nextLine();
                        managerAccount.login(name,pass);
                    }
                    break;
                case 2:
                    managerAccount.creatAccount();
                    break;
                case 3:
                    System.out.println("Nhập username muốn đổi password: ");
                    String username = scanner.nextLine();
                    if(managerAccount.checkUsername(username)) {
                        managerAccount.changePassword(username);
                    }
                    break;
                case 4:
                    managerAccount.show();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}