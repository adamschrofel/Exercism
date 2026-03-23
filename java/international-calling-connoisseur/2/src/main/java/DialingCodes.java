import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DialingCodes {
    private final Map<Integer, String> dialCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialCodes;
    }

    public void setDialingCode(Integer code, String country) {
        dialCodes.put(code, country);
    }

    public String getCountry(Integer code) {
        return dialCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!dialCodes.containsKey(code) && !dialCodes.containsValue(country)) {
            dialCodes.put(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialCodes.entrySet()) {
            if (Objects.equals(country, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer location = findDialingCode(country);
        if (location != null) {
            dialCodes.remove(location);
            dialCodes.put(code, country);
        }
    }
}
