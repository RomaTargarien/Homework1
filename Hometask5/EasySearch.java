package Hometask5;

public class EasySearch implements ISearchEngine {

    private static boolean flag = true;

    @Override
    public long search(String text, String word) {
        long result = 0;
        StringBuilder wordcopy = new StringBuilder();
        boolean flag = true;

        //Чтобы не выходило за пределы массива
        text = " " + text + " ";
        //Это то, чем мы заменяем наше слово
        for (int i = 0; i < word.length(); i++){
            wordcopy.append("x");
        }
        text = text.replaceAll("[,.!?\"()1234567890=+>^]", " ");
        char[] allchars = text.toCharArray();
        while (flag){
            //Замена искомого слова, которое входит в состав другого слова
            if (allchars[text.indexOf(word) + word.length()] != ' ' ||
                    allchars[text.indexOf(word) -1 ] != ' '){
                text = text.replaceFirst(word, wordcopy.toString());
            }
            //Увеличение счетчика, замена слова
            if (text.indexOf(word) > 0 && allchars[text.indexOf(word) + word.length()] == ' '&&
                    allchars[text.indexOf(word) -1 ] == ' ') {
                result++;
                text = text.replaceFirst(word, wordcopy.toString());
            }
            //Проверка наличия слова
            if (!text.contains(word)){
                flag = false;
            }
        }
        return result;
    }
}
