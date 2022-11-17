package manager;

import user.Account;

import java.util.*;

public class ManagerAccount {
    final int capacity = 10;
    Map<String, String> accounts = new HashMap<>(capacity);
    Scanner scanner = new Scanner(System.in);

    public void show() {
        System.out.println(accounts.entrySet());
    }

    public boolean checkUsername(String username) {
        if (!(accounts.containsKey(username))) {
            System.out.println("Không tìm thấy tài khoản!");
            return false;
        } else return true;
    }

    public void creatAccount() {
        System.out.println("Tạo username: ");
        String username = scanner.nextLine();
        System.out.println("Tạo password: ");
        String password = scanner.nextLine();
        accounts.put(username, password);
    }

    public void changePassword(String username) {
        if (checkUsername(username)) {
            System.out.println("Nhập password cũ: ");
            String password = scanner.nextLine();
            if (password.equals(accounts.get(username))) {
                System.out.println("Nhập password mới: ");
                String newpass = scanner.nextLine();
                accounts.put(username, newpass);
            } else {
                System.out.println("Thay đổi mật khẩu thất bại!Nhập sai mật khẩu cũ!");
            }
        }
    }
    public void login(String username, String password) {
        if (checkUsername(username)) {
            if (password.equals(accounts.get(username))) {
                System.out.println("Đăng nhập thành công!");
            } else {
                System.out.println("Đăng nhập thất bại!Nhập sai mật khẩu!");
            }
        }
    }
}
