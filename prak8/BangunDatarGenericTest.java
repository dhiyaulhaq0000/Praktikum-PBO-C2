public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran1);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());

        Segitiga segitiga1 = new Segitiga(3, 4);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(segitiga1);
        System.out.println("keliling segitiga: " + bdgSegitiga.hitungKeliling());
        System.out.println("tipe generic: " + bdgSegitiga.get().getClass().getName());
    }
}
