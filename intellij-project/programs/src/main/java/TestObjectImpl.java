/**
 * Paquet de définition
 **/

import org.codehaus.generated.TestObject;
/**
 * Description: Merci de donner une description du service rendu par cette classe
 */
public class TestObjectImpl extends TestObject {



  public static void main(String ... args) {
    TestObjectImpl t = new TestObjectImpl();

    t.cat = "testCat";
    t.type = "testType";

    System.out.println(String.format("Result : %s, %s", t.cat, t.type));
  }
}
 
