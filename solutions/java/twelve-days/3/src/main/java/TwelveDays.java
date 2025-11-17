class TwelveDays {
    private static final String[] day = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
    private static final String[] message = {"a Partridge in a Pear Tree", "two Turtle Doves", "three French Hens", "four Calling Birds", "five Gold Rings", "six Geese-a-Laying", "seven Swans-a-Swimming", "eight Maids-a-Milking", "nine Ladies Dancing", "ten Lords-a-Leaping", "eleven Pipers Piping", "twelve Drummers Drumming"};

    String verse(int verseNumber) {
        String text = "On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: ";
        for(int i=verseNumber-1;i>=0;i--){
            if(i==verseNumber-1){
                text = text+message[i];
            }else if(i==0){
                text = text+", and "+message[i];
            } else {
                text = text+", "+message[i];
            }
        }
        return text.concat(".\n");
    }

    String verses(int startVerse, int endVerse) {
        var versos = "";
        for(int i=startVerse;i<=endVerse;i++){
            if(i!=endVerse){
                versos = versos+verse(i)+"\n";
            } else {
                versos = versos+verse(i);
            } 
        }
        return versos;
    }
    
    String sing() {
        return verses(1,12);
    }
}
