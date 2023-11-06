import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void testAddFirst(){
        PhoneBook phoneBook=new PhoneBook();
        String name1 = "Bob";
        String number1 ="1111";

        int result;
        result = phoneBook.add (name1, number1);

        int expected = 1;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAddDouble(){
        PhoneBook phoneBook=new PhoneBook();
        String name1 = "Bob";
        String number1 ="1111";

        String name2 = "Ann";
        String number2 ="2222";

        String name3 = "Bob";
        String number3 ="3333";

        int result;
        result = phoneBook.add (name1, number1);
        result = phoneBook.add (name2, number2);
        result = phoneBook.add (name3, number3);

        int expected = 2;

        Assert.assertEquals(expected, result);
    }
}
