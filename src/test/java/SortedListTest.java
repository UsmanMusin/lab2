import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedListTest {

    OktmoReader reader_one = new OktmoReader();
    OktmoData oktmoData_one = new OktmoData();

    @Test
    public void test_print_sortedList(){
        reader_one.readPlaces("data-201710.csv", oktmoData_one);
        oktmoData_one.sortPlace();
    }

}