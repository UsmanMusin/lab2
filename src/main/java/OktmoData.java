import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class OktmoData {
    ArrayList <Place> placeList = new ArrayList<>();
    HashSet <String> allStatus = new HashSet<>();
    ArrayList <Place> sortedPlaceList = new ArrayList<>();

    public void addPlace(Place place){
        placeList.add(place);
        if(!(place.getStatus().equals(""))){
            allStatus.add(place.getStatus());
        }

    }

    public void printAllStatus(){
        System.out.println(allStatus);
    }

    public void printOktmodata(){
        System.out.println("Считано НП: " + placeList.size());
        for (Place placeForPrint: placeList) {
            System.out.println(placeForPrint);
        }
    }
    public void sortPlace(){
        sortedPlaceList.clear();
        sortedPlaceList.addAll(placeList);
        Collections.sort(sortedPlaceList, new PlaceNameComparator());
        System.out.println("\bОтсортированный список по названию:");
        for(Place p: sortedPlaceList){
            System.out.println(p);
        }
    }


     public static boolean equalLists(OktmoData oktmoData1, OktmoData oktmoData2) {
         boolean flag = true;
         if (oktmoData1.placeList.size() != oktmoData2.placeList.size()) {
             return false;
         } else {

             for (int i = 0; i < oktmoData1.placeList.size(); i++) {
                 if (!oktmoData2.placeList.get(i).equals(oktmoData1.placeList.get(i))) {
                     flag = false;
                     break;
                 }
             }
             return flag;
         }
     }
}
