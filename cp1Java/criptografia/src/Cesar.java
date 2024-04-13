public class Cesar {
    String[] alfabeto = new String[]{" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] alfabetoCifraCesar = new String[]{" ", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String resolucao = "";
    public void criptografa(String fraseUser){
        for (int i = 0; i <= (fraseUser.length()-1); i++) {
            char ch = fraseUser.charAt(i);
            for (int j = 0; j < (alfabeto.length-1); j++) {
                if (ch == alfabeto[j].charAt(0)) {
                    resolucao += alfabetoCifraCesar[j];
                    break;
                }
            }
        }
        System.out.println(resolucao);
    }
    public void descriptografa(String fraseUser){
        for (int i = 0; i <= (fraseUser.length()-1); i++) {
            char ch = fraseUser.charAt(i);
            for (int j = 0; j < (alfabetoCifraCesar.length-1); j++) {
                if (ch == alfabetoCifraCesar[j].charAt(0)) {
                    resolucao += alfabeto[j];
                    break;
                }
            }
        }
        System.out.println(resolucao);
    }
}
