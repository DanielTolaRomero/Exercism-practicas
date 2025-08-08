class Scrabble {
private char[] letras;
    private int score = 0;
    public Scrabble(String word) {
        letras = word.toLowerCase().toCharArray();
    }

    int getScore() {
        for (char letra:letras){

            if(('q'==letra)||('z'==letra)){
                System.out.println(letra);
                score+=10;
            } else if(('j'==letra)||('x'==letra)){
                System.out.println(letra);
                score+=8;
            } else if('k'==letra){
                System.out.println(letra);
                score+=5;
            } else if(('d'==letra)||('g'==letra)){
                System.out.println(letra);
                score+=2;
            } else if(('b'==letra)||('c'==letra)||('m'==letra)||('p'==letra)) {
                System.out.println(letra);
                score += 3;
            } else if(('f'==letra)||('h'==letra)||('v'==letra)||('w'==letra)||('y'==letra)){
                System.out.println(letra);
                score+=4;
            } else {
                System.out.println(letra);
                score +=1;
            }
        }
        return score;
    }
}
