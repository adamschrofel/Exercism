import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();
    
    public boolean isEmpty() {
        int size = languages.size();
        return size == 0;
    }

    public void addLanguage(String language) {
       if(!languages.contains(language)){
           languages.add(language);
       }
    }

    public void removeLanguage(String language) {
        if (languages.contains(language)){
       languages.remove(language);
        }
    }

    public String firstLanguage() {
        if(!languages.isEmpty()){
            return languages.get(0);
        }
        return "none";
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains("Java") || languages.contains("Kotlin");
    }
}
