package home.hyywk.top.util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner;

    static {
        if ( scanner == null ) {
            synchronized (InputUtil.class) { // 对该类进行加锁
                if ( scanner == null ) {
                    scanner = new Scanner( System.in );
                }
            }
        }
    }

    public static Scanner getScanner() {
        return scanner;
    }

}
