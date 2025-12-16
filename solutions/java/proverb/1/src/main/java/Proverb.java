class Proverb {

    private String[] words;
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        String result = "";
        if(words.length==1){
            return "And all for the want of a "+words[0]+".";
        }
        if(words.length==0){
            return "";
        }
        for(int i =0;i<words.length-1; i++){
            result = result + "For want of a "+words[i]+" the "+words[i+1]+" was lost.\n";
        }
        return result + "And all for the want of a "+words[0]+".";
    }

}
