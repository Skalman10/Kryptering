package Model;

public class Krypt {
    private String Data;
    private String Key;

    public Krypt() {
        Data = "Hej";
        Key = "a";
    }

    public Krypt(String data) {
        Data = data;
        Key = "a";
    }
    public Krypt(String data,String key) {
        Data = data;
        Key = key;
    }
    public String encryptString () {
        int keyLength = Key.length();
        String encryptedString="";

        for (int i = 0; i<Data.length();i++) {
            encryptedString += (char) (Data.charAt(i)^Key.charAt(0))+"";
        }
        return encryptedString;
    }
}
