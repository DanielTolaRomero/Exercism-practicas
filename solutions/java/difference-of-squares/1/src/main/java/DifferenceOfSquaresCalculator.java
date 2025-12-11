class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int mid = input%2 != 0 ? input/2+1:0;
        return (int) Math.pow(((1+input) * (input/2) + mid),2);
    }

    int computeSumOfSquaresTo(int input) {
        var result = 0;
        for(int i=1;i<=input;i++){
            result += (int) Math.pow(i,2);
        }
        return result;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
