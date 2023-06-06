import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args) {
        // deklarasi Hashmap mhs
        Map<String, String> mhs = new HashMap<String, String>();

        // mengisikan data ke Hashmap mhs
        mhs.put("24060121140134", "Dhiya Ulhaq");

        // menampilkan data mhs berdasarkan nim
        mhs.keySet().forEach((nim) -> System.out.println(nim + " " + mhs.get(nim)));
    }
}