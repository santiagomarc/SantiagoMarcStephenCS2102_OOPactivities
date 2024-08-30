public class Escseq {
    public static void main(String[] args) {
        boolean tab = false;

        for (int i = 1; i <= 10; i++) {
            int multiple = 7 * i;
            if (tab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple); 
            }
            tab = !tab;
        }
    }
}
