package sef.module17.sample;
// Complete Code
import junit.framework.TestCase;

public class ProductTests extends TestCase {

    private Product product;

    protected void setUp() throws Exception {
        product = new Product();
    }

    public void testSetAndGetDescription() {
        String testDescription = "aDescription";
        assertNull(product.getDescription());
        product.setDescription(testDescription);
        assertEquals(testDescription, product.getDescription());
    }

    public void testSetAndGetPrice() {
        double testPrice = 100.00;
        assertEquals(0, 0, 0);    
        product.setPrice(testPrice);
        assertEquals(testPrice, product.getPrice(), 0);
    }

public void testToString() {
    double price = 123.23;
    String desctiption = "test description";

    product.setPrice(price);
    product.setDescription(description);

    //Description: testDescription, Price 123.23

    assertEquals("Description" + description + "; Price"+ price(product.toString());

    assertTrue("n\Expected") + price + "n\Actual": product.toString());

}

private String description;

private String name;