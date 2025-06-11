public class IndexFinder {
    public static void main(String[] args) {
        String string = "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire.";
        String word = "code";
        int indexOfFirstWord = getIndexOfFirstWord(string, word);
        int indexOfLastWord = getIndexOfLastWord(string, word);
        System.out.println("The index of the first character of the first instance of the word \"" + word + "\" is " + indexOfFirstWord);
        System.out.println("The index of the first character of the last instance of the word \"" + word + "\" is " + indexOfLastWord);
    }

    public static int getIndexOfFirstWord(String string, String word){
        int indexReturn;

        int indexWordFirst = string.indexOf(word);
        indexReturn = indexWordFirst;
        return indexReturn;
    }

    public static int getIndexOfLastWord(String string, String word){
        int indexReturn;

        int indexWordLast = string.indexOf(word);
        indexReturn = indexWordLast;
        return indexReturn;
    }
}
