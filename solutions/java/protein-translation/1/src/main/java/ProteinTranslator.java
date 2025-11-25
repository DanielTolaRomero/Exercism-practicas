import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import static java.util.Map.entry;

class ProteinTranslator {

    private Map<String,String> aminoAcidos = Map.ofEntries(
        entry("AUG","Methionine"),
        entry("UUU","Phenylalanine"),
        entry("UUC","Phenylalanine"),
        entry("UUA","Leucine"),
        entry("UUG","Leucine"),
        entry("UCU","Serine"),
        entry("UCC","Serine"),
        entry("UCA","Serine"),
        entry("UCG","Serine"),
        entry("UAU","Tyrosine"),
        entry("UAC","Tyrosine"),
        entry("UGU","Cysteine"),
        entry("UGC","Cysteine"),
        entry("UGG","Tryptophan"),
        entry("UAA","STOP"),
        entry("UAG","STOP"),
        entry("UGA","STOP")
        );
    // UUC UUC UAA UGG U
    
    List<String> translate(String rnaSequence) {
        List<String> resultado = new ArrayList<>();
        var longitud = rnaSequence.length(); 
        var ciclos = longitud-longitud%3;
        var lastCodon = "";
        for(int i = 0; i<ciclos;i+=3){
            var codon = rnaSequence.substring(i,i+3);
            if (!aminoAcidos.containsKey(codon)) {
                throw new IllegalArgumentException("Invalid codon");
            }
            if(aminoAcidos.get(codon).equals("STOP")){
                lastCodon = "STOP";
                break;
            } 
            resultado.add(aminoAcidos.get(codon));
        }
        if(longitud%3!=0&&!lastCodon.equals("STOP")){
            throw new IllegalArgumentException("Invalid codon");
        }
        return resultado;
    }
}
