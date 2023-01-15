import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    // TODO: 20.12.2022 Подумать и поменять generic-type для этой Map
    private Map<List<String>, String> storage = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        for (int i = 0; i < surname.length(); i++) {
            List<String> str = new ArrayList<>();
            str.add(surname);
            String put = storage.put(str, phoneNumber);
        }


    }

    public String getBySurname(String surname) {
        return storage.get(surname);
    }
}
