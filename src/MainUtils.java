public class MainUtils {

    public <T> void print(T printable) {
        System.out.println(printable);
    }

    public void separator() {
        for (int i = 1; i <= 20; i++) {
            System.out.print('-');
        }
    }

}
