public class MainUtils {

    public final static char DASH = '-';
    public final static char X = 'x';
    public final static char O = 'o';

    public <T> void print(T printable) {
        System.out.println(printable);
    }

    public void separator() {
        for (int i = 1; i <= 20; i++) {
            System.out.print('-');
        }
        System.out.print('\n');
    }

}
