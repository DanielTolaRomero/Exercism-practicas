import java.util.Set;
import java.util.stream.Collectors;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("[\\s\\p{Punct}]", "").toLowerCase();
        char[] letras = phrase.toCharArray();
        Set<Character> letrasSinRepetir = phrase.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        return letras.length ==letrasSinRepetir.size();
    }

}
