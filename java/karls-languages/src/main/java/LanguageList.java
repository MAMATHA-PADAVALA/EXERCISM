import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.size()==0)
            return true;
        else
            return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.remove(0);
    }

    public int count() {

        return languages.size();
    }

    public boolean containsLanguage(String language) {

        if(languages.contains(language))
            return true;
        else
            return false;
    }

    public boolean isExciting() {
        boolean flag=false;
         if(languages.contains("Java"))
             flag=true;
         if(languages.contains("Kotlin"))
             flag=true;
         return flag;
    }
}
