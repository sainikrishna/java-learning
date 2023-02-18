import java.util.Date;

public class cwh_97_date_class {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE - System.currentTimeMillis());
//        System.out.println(1000*60*60*24*365);
//        System.out.println(9223370363779269264L/1471228928);

        System.out.println(new Date(1905, 4, 2).getTime());
        System.out.println(new Date(1905, 4, 2).getDate());
        System.out.println(new Date().getSeconds());
    }
}
