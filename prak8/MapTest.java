import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> Integer, nilai -> String
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        // Menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> keySet = map.keySet();
        
        // Iterasi untuk mengambil keseluruhan nilai dari kunci
        for (Integer key : keySet) {
            String value = map.get(key);
            System.out.println("Nilai untuk kunci " + key + ": " + value);
        }
    }
}
