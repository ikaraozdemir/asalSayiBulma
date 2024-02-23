public class Main {

    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int i = 2; i <= 100; i++) {
            if (i == 2) {
                System.out.print(i + " "); // 2 sayısını ayrı değerlendir.
            } else {
                int check = 2;
                int count = 0;
                while (check < i) { // 2'den i'ye kadar tek tek böl
                    if (i % check == 0) count++;  // Tam bölünüyorsa sayacı artır.
                    check++;
                }
                if (count == 0) {    // sayac 0 kaldıysa sayı asal demektir.
                    System.out.print(i + " ");
                }
            }
        }
    }
}


