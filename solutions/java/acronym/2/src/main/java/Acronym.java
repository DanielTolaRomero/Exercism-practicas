class Acronym {

    private String acronym = "";
    Acronym(String phrase) {
        String[] words = phrase.replace("-"," ").replaceAll("\\p{Punct}","").split("\\s+");
        for(String w:words){
            acronym = acronym + w.charAt(0);
        }

    }

    String get() {
        return acronym.toUpperCase();
    }

}
