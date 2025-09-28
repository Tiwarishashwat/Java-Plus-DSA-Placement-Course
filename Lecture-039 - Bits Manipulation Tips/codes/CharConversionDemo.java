public class CharConversionDemo {
    private char toLower(char ch){
        return (char)(ch | (1<<5));
    }

    private char toLowerSpecial(char ch){
        return (char)(ch | ' ');
    }

    private char toUpper(char ch){
        return (char)(ch & ~(1<<5));
    }

    private char toUpperSpecial(char ch){
        return (char)(ch & '_');
    }

    private char toggleSpecialCase(char ch){
        return (char)(ch ^ ' ');
    }

    private char toggleCase(char ch){
        return (char)(ch ^ (1<<5));
    }

    public static void main(String[] args) {
        CharConversionDemo cc = new CharConversionDemo();
        System.out.println("lower: " + cc.toLower('Z'));
        System.out.println("Upper: " + cc.toUpper('b'));
//
        System.out.println("toggle: " + cc.toggleCase('c'));
        System.out.println("toggle: " + cc.toggleCase('F'));

        System.out.println("toLowerSpecial: " + cc.toLowerSpecial('z'));
        System.out.println("toUpperSpecial: " + cc.toUpperSpecial('b'));

        System.out.println("toggleSpecialCase: " + cc.toggleSpecialCase('c'));
        System.out.println("toggleSpecialCase: " + cc.toggleSpecialCase('F'));
    }

}
