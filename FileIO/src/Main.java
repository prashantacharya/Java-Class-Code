import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("hello.txt");
        FileOutputStream fos = new FileOutputStream("op.txt", true);
        int i;

        while ((i = fis.read()) != -1) {
            fos.write(i);
        }
        fos.write(13);

        fis.close();
        fos.close();
    }
}
