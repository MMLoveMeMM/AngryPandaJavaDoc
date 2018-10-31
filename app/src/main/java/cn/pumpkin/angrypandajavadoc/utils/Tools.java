package cn.pumpkin.angrypandajavadoc.utils;
/**
 * Miscellaneous {@link String} utility methods.
 * <p>
 * <p>Mainly for internal use within the framework; consider
 * <a href="http://commons.apache.org/proper/commons-lang/">
 * Apache's Commons Lang</a>
 * for a more comprehensive suite of {@code String} utilities.
 * <p>
 * <p>This class delivers some simple functionality that should really be
 * provided by the core Java {@link String} and {@link StringBuilder}
 * classes. It also provides easy-to-use methods to convert between
 * delimited strings, such as CSV strings, and collections and arrays.
 */

/**
 * @author: zhibao.Liu
 * @version:
 * @date: 2018/10/31 16:36
 * @des:
 * @see {@link https://blog.csdn.net/vbirdbest/article/details/80296136}
 */

public class Tools {

    /**
     * 默认数量 {@value} .
     * */
    private static final Integer QUANTITY = 1;

    private int mNumber;

    public Tools() {

    }

    public Tools(int num) {
        mNumber = num;
    }

    /**
     * @author liuzhibao
     * @param d1 add number
     * @param d2 added number
     * */
    public static int addSum(int d1, int d2) {
        return d1 + d2;
    }

    /**
     * @author liuzhibao
     * @param number1 checked number
     * @param number2 check number
     * @return {@code true} number1 is lager than number2;{@code false} number1 is less than number2
     * */
    public boolean maxValue(int number1, int number2) {
        return number1 > number2 ? true : false;
    }


    /**
     * File -> Setting -> plugin -> install javadoc plugin
     * javadoc 如果无法自动下载,就复制说明里面的链接,下载手动添加到android studio 安装目录的plugin下;
     * javadoc 默认是不能存在中文字符的,所以在弹出生成的对话框的Other command line arguments中填上
     * -encoding utf-8 -charset utf-8
     * */
    /**
     * Rep string.
     *
     * @param info the info
     * @return the string
     */
    public String rep(String info) {
        return info;
    }

    /**
     * Hello.
     *
     * @param data the data
     * @param code the code
     */
    public void hello(final String data, final int code) {

    }

}
