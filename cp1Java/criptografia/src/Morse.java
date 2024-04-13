public class Morse {
    String[] alfabeto = new String[]{" ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] alfabetoCifraMorse = new String[]{
            "/",     // Espaço
            ".-",    // A
            "-...",  // B
            "-.-.",  // C
            "-..",   // D
            ".",     // E
            "..-.",  // F
            "--.",   // G
            "....",  // H
            "..",    // I
            ".---",  // J
            "-.-",   // K
            ".-..",  // L
            "--",    // M
            "-.",    // N
            "---",   // O
            ".--.",  // P
            "--.-",  // Q
            ".-.",   // R
            "...",   // S
            "-",     // T
            "..-",   // U
            "...-",  // V
            ".--",   // W
            "-..-",  // X
            "-.--",  // Y
            "--..",  // Z
            "-----", // 0
            ".----", // 1
            "..---", // 2
            "...--", // 3
            "....-", // 4
            ".....", // 5
            "-....", // 6
            "--...", // 7
            "---..", // 8
            "----."  // 9
    };
    String resolucao = "";
    int i = 0;

    public void criptografa(String fraseUser) {
        for (int i = 0; i < fraseUser.length(); i++) {
            char ch = fraseUser.charAt(i);
            for (int j = 0; j < alfabeto.length - 1; j++) {
                if (ch == alfabeto[j].charAt(0)) {
                    resolucao += alfabetoCifraMorse[j];
                    if (i != fraseUser.length() - 1) {
                        resolucao += " ";
                    }
                    break;
                }
            }
        }
        System.out.println(resolucao);
    }


    public void descriptografa(String fraseUser) {
        StringBuilder letraTemporaria = new StringBuilder();
        resolucao = "";
        for (int i = 0; i < fraseUser.length(); i++) {
            char ch = fraseUser.charAt(i);
            if (ch == ' ' || i == fraseUser.length() - 1) {
                if (i == fraseUser.length() - 1) {
                    letraTemporaria.append(ch);
                }
                for (int j = 0; j < alfabetoCifraMorse.length; j++) {
                    if (letraTemporaria.toString().equals(alfabetoCifraMorse[j])) {
                        resolucao += alfabeto[j];
                        letraTemporaria.setLength(0);
                        break;
                    }
                }
            } else {
                letraTemporaria.append(ch);
            }
        }
        System.out.println(resolucao);
    }
}