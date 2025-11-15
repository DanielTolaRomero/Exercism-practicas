class TwelveDays {
    String song = "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.";
    String verse(int verseNumber) {
            String[] vers = song.split("\\.");
            return vers[verseNumber-1].concat(".\n");
    }

    String verses(int startVerse, int endVerse) {
        var vers = song.split("\\.");
        String versos = "";
        for(int i = startVerse-1;i<endVerse;i++){
            if(i!=endVerse-1){
                versos = versos.concat(vers[i].concat(".\n\n"));
            } else {
                versos = versos.concat(vers[i].concat(".\n"));
            }   
        }
        return versos;
    }
    
    String sing() {
        var vers = song.split("\\.");
        String versos = "";
        for(int i = 0;i<vers.length;i++){
            if(i!=vers.length-1){
                versos = versos.concat(vers[i].concat(".\n\n"));
            } else {
                versos = versos.concat(vers[i].concat(".\n"));
            }   
        }
        return versos;
    }
}
