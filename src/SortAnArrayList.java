import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class SortAnArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> listNeedingSorting = new ArrayList<>();

        listNeedingSorting.add(45);
        listNeedingSorting.add(88);
        listNeedingSorting.add(23);
        listNeedingSorting.add(1);
        listNeedingSorting.add(100);
        System.out.println("List before sort: " + listNeedingSorting);

        for (int i = 0; i < listNeedingSorting.size(); i++) {
            for (int j = i + 1; j < listNeedingSorting.size(); j++)
                if (listNeedingSorting.get(i) > listNeedingSorting.get(j)) {
                    int temp = listNeedingSorting.get(j);
                    listNeedingSorting.set(j, listNeedingSorting.get(i));
                    listNeedingSorting.set(i, temp);
                }
        }
        System.out.println("List after sort: " + listNeedingSorting);
    }
}

