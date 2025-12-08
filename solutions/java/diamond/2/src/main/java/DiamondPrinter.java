import java.util.List;
import java.util.ArrayList;
class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamante = new ArrayList<>();
        int dif = a - 'A';
        int longitud = dif * 2 + 1;
        String text = " ".repeat(longitud);
        char c = 'A';
        
        for(int i = 0;i <= dif; i++){
            StringBuilder sb = new StringBuilder(text);
                sb.setCharAt((dif-i),c);
                sb.setCharAt((dif+i),c);
                c++;
            diamante.add(sb.toString());
        }
        c-=2;
        for(int i = dif-1; i >= 0; i--){
            StringBuilder sb = new StringBuilder(text);
                sb.setCharAt((dif-i),c);
                sb.setCharAt((dif+i),c);
                c--;
            diamante.add(sb.toString());
        }
        return diamante;
    }

}
