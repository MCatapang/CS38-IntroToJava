
/**
 * Write a description of class ReplaceTester here.
 *
 * @author Michael Angelo Catapang
 * @version 09/01/22
 */
public class ReplaceTester
{
    public ReplaceTester()
    {
        String word = "Mississippi";
        String newWord = word.replace('i', '!');
        newWord = newWord.replace('s', '$');
        System.out.println("The word is " + word);
        System.out.println("The encoded string is " + newWord);
    }
}
