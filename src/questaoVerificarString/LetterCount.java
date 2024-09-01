package questaoVerificarString;

public class LetterCount {

    /*Poderia ter feito um código simplificado, mas preferi fazer validações antes*/

    public int countOccurrencesOfA(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int count = 0;
        String lowerCaseInput = input.toLowerCase();

        for (char c : lowerCaseInput.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        return count;
    }


    public boolean containsA(String input) {
        return countOccurrencesOfA(input) > 0;
    }
}
