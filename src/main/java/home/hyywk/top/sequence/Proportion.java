package home.hyywk.top.sequence;

import home.hyywk.top.util.InputUtil;

import java.util.Scanner;

/**
 * 等比数列求和
 */
public class Proportion {

    public static void main(String[] agrs) throws Exception { // 如果投入生产环境的话，可以继续封装
        Scanner scanner = InputUtil.getScanner();
        double consequence; // 和
        synchronized ( scanner ) { // 必须加锁，否则会有线程安全的问题
            System.out.println( "请输入首项：" );
            double a = scanner.nextFloat(); // 首项
            System.out.println( "请输入等比：" );
            double q = scanner.nextFloat(); // 等比
            System.out.println( "请输入项数：" );
            int n = scanner.nextInt(); // 多少项
            if ( q == 1.0d ) {
                throw new Exception( "q不可以为0");
            }
            consequence =  a * ( 1 - Math.pow(q, n) ) / ( 1 - q );
        }
        System.out.println( "结果为：" + consequence );
    }

}
