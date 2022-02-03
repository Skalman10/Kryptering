import Model.Krypt;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Data:");
        String data = in.nextLine();

        System.out.println("Key:");
        String key = in.nextLine();

        Krypt crypt = new Krypt(data,key);

        System.out.println(crypt.encryptString());
    }
}
