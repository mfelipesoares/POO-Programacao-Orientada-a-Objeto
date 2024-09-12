import java.util.*;
import java.io.*;


class LimpaConsole {
    public static void main(String[] args) throws IOException, InterruptedException {
	static Runtime run = Runtime.getRuntime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teste");
        String texto = scanner.next();
	System.out.println("Texto:" + texto);
	run.exec("bash clear");

      

    }
}
