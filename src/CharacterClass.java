public class CharacterClass {

    public static void main(String[] args){
        Character ch = 'a';
        System.out.println(ch);
        System.out.println(ch.charValue());
        System.out.println(ch.compareTo('b'));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.isUpperCase(ch));
    }
}
