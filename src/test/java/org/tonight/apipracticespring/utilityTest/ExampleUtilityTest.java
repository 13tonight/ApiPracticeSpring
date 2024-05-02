package org.tonight.apipracticespring.utilityTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tonight.apipracticespring.utility.ExampleUtility;

public class ExampleUtilityTest {

    @Test
    public void testOneAdd() {
    ExampleUtility exampleUtility = new ExampleUtility();
    Assertions.assertEquals(15,exampleUtility.additionDetails(5,5) );

}
}
