import java.math.BigDecimal;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        BigDecimal avg = new BigDecimal(0);
        BigDecimal lowSeasonResult = new BigDecimal(15).multiply(new BigDecimal(4 / 12.0));
        BigDecimal busySeasonResult = new BigDecimal(78).multiply(new BigDecimal(5 / 12.0));
        BigDecimal ordinaryMonthResult = new BigDecimal("45").multiply(new BigDecimal(3 / 12.0));
        BigDecimal avgResult = avg.add(lowSeasonResult).add(busySeasonResult).add(ordinaryMonthResult);
        //.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();

       BigDecimal num = new BigDecimal(0.0);
       String a1 = "25%";
       BigDecimal totalCurrentLiability =new BigDecimal(19.5);
       BigDecimal totalCurrentAssets =new BigDecimal(621.6);

        System.out.println( totalCurrentAssets.divide(totalCurrentLiability,2, BigDecimal.ROUND_HALF_UP));
    }
}
