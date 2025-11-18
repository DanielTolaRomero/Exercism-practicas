class Acronym {

    private String phrase;
    Acronym(String phrase) {
        this.phrase = phrase.replace("-"," ").replaceAll("\\p{Punct}","").replaceAll("\\s+", " ");;
    }

    String get() {
        var words = phrase.split(" ");
        var acronym = "";

        for(String a:words){
            acronym = acronym + a.charAt(0);
        }

        return acronym.toUpperCase();
    
    }

}
