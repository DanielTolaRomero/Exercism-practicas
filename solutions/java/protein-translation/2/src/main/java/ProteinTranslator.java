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
        boolean stop = true;
        
        var longitud = rnaSequence.length()-2; 
        
        for(int i = 0; i<longitud;i+=3){
            var codon = rnaSequence.substring(i,i+3);
            var proteina = aminoAcidos.get(codon);
            if (proteina==null) {
                throw new IllegalArgumentException("Invalid codon");
            }
            if(proteina.equals("STOP")){
                stop = false;
                break;
            }
            resultado.add(proteina);
        }
        if(rnaSequence.length()%3!=0&&stop){
            throw new IllegalArgumentException("Invalid codon");
        }
        return resultado;
    }
}
