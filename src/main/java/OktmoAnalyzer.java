import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OktmoAnalyzer {
    public void test_first(OktmoData oktmoData) {
        boolean flag = false;
        ArrayList<Place> filteredList = new ArrayList<>();
        System.out.println("\nПрименили регуларные выражения:");
        Pattern p = Pattern.compile("^.{0,2}ово$");
        for (Place pl : oktmoData.placeList) {
            Matcher m = p.matcher(pl.getName());
            if (m.matches()) {
                flag = true;
                filteredList.add(pl);
                System.out.println(pl);
            }
        }
        if (flag) {
            for (Place filteredPlace : filteredList) {
                System.out.println(filteredPlace);
            }
        } else {
            System.out.println("Таких НП нет");
        }

    }

    public void test_second(OktmoData oktmoData) {
        boolean flag = false;
        ArrayList<Place> filteredList = new ArrayList<>();
        System.out.println("\nНП с названиями, которые начинаются и заканчиваются на одну и ту же согласную букву");
        Pattern p = Pattern.compile("^([бвгджйзклмнпрстфхцчшщ]).*(\\1)$",
                Pattern.CASE_INSENSITIVE + Pattern.UNICODE_CASE);
        for (Place pl : oktmoData.placeList) {
            Matcher m = p.matcher(pl.getName());
            if (m.matches()) {
                flag = true;
                filteredList.add(pl);
            }
        }
        if (flag) {
            for (Place filteredPlace : filteredList) {
                System.out.println(filteredPlace);
            }
        } else {
            System.out.println("Таких НП нет");
        }
    }
}
