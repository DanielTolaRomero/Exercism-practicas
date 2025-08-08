class Darts {
    int score(double cordX, double cordY) {
        int puntaje = 0;
        double distancia = Math.sqrt(Math.pow(cordX,2)+Math.pow(cordY,2));
        if(distancia <= 1){
            puntaje = 10;
        } else if(distancia <= 5){
            puntaje = 5;
        } else if(distancia <= 10){
            puntaje = 1;
        }
        return puntaje;
    }
}
