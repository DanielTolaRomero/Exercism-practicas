public class PangramChecker {

    public boolean isPangram(String input) {
        var text = input.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z').distinct().count();
        
        return text == 26;
    }

}
