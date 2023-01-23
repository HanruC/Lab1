package stock;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;



/**
 * A JUnit test class for the stock class.
 * Set a test, Apple.
 */
public class StockTest {
  private Stock Apple;
  
  /**
   * Set up value for the example.
   */
  @Before
  public void setUp() {
    Apple = new Stock("Appl", "Apple", 137.87);
  }
  
  /**
   * Test for the symbol.
   */
  @Test
  public void getSymbolTest() {
    assertEquals("Appl", Apple.getSymbol());
  }
  
  /**
   * Test for the name.
   */
  @Test
  public void getNameTest() {
    assertEquals("Apple", Apple.getName());
  }
  
  /**
   * Test to get cost basis.
   */
  @Test
  public void getCostBasisTest() {
    assertEquals(137.87, Apple.getCostBasis(), 0.01);
  }
  
  /**
   * Test to get current price.
   */
  @Test
  public void getCurrentPrice() {
    assertEquals(137.87, Apple.getCurrentPrice(), 0.01);
  }
  
  /**
   * Test to set a new value of cost basis.
   */
  @Test
  public void setCostBasis() {
    double costBasis = 135.78;
    Apple.setCostBasis(costBasis);
    assertEquals(135.78, Apple.getCostBasis(), 0.01);
  }
  
  /**
   * Test to set a new value for current price.
   */
  @Test
  public void setCurrentPrice() {
    double currentPrice = 202.12;
    Apple.setCurrentPrice(currentPrice);
    assertEquals(202.12, Apple.getCurrentPrice(), 0.01);
  }
  
  /**
   * Test to see if the change percent is right.
   */
  @Test
  public void getChangePercent() {
    double currentPrice = 202.12;
    Apple.setCurrentPrice(currentPrice);
    assertEquals(0.466, Apple.getChangePercent(), 0.01);
  }
  
  /**
   * Test to see the if the output string according to Apple example is right.
   */
  @Test
  public void testToString() {
    double currentPrice = 202.12;
    Apple.setCurrentPrice(currentPrice);
    assertEquals("Apple Current Price: $ 202.12\n Gain/Loss: 46.60%", Apple.toString());
  }
}