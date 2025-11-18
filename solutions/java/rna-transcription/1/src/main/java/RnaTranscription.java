class RnaTranscription {

    String transcribe(String dnaStrand) {
        var rna = "";
        for(int i=0;i<dnaStrand.length();i++){
            var letra = dnaStrand.charAt(i);
            switch(letra){
                case 'G':
                    rna = rna + 'C';
                break;
                case 'C':
                    rna = rna + 'G';
                break;
                case 'T':
                    rna = rna + 'A';
                break;
                case 'A':
                    rna = rna + 'U';
                break;
            }
        }
        return rna;
    }

}
