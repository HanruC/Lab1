package stock;

/**
This class represents a stock.
 */
public class Stock {
  private final String symbol;
  private final String name;
  private double CostBasis;
  private double currentPrice;
  
  /**
   * Construct a stock instance and initialize it to its given symbol, name, and cost basis.
   * @param symbol symbol of the stock.
   * @param name name of the stock.
   * @param CostBasis cost basis of the stock.
   */
  public Stock(String symbol, String name, double CostBasis) {
    this.symbol = symbol;
    this.name = name;
    this.CostBasis = CostBasis;
    this.currentPrice = CostBasis;
  }
  
  /**
   * Get the symbol of the stock.
   *
   * @return the symbol of the stock.
   */
  public String getSymbol() {
    return this.symbol;
  }
  
  /**
   * Get the name of the stock.
   *
   * @return the name of the stock.
   */
  public String getName() {
    return this.name;
  }
  
  /**
   * Get the cost basis of the stock.
   *
   * @return the cost basis.
   */
  public double getCostBasis() {
    return this.CostBasis;
  }
  
  /**
   * Get the current price of the stock.
   *
   * @return the current price.
   */
  public double getCurrentPrice() {
    return this.currentPrice;
  }
  
  /**
   * Set a new cost basis to the stock.
   * @param costBasis new cost basis
   */
  public void setCostBasis(double costBasis) {
    this.CostBasis = costBasis;
  }
  
  /**
   * Set a new current price to the stock.
   * @param currentPrice new price.
   */
  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }
  
  /**
   * Calculate the percent changes between cost basis and current price.
   *
   * @return a fractional number of changes.
   */
  public double getChangePercent() {
    return ((this.currentPrice - this.CostBasis) / this.CostBasis);
  }
  
  /**
   * Represent the stock as a string, describing its name, current price and the change
   * percentages.
   *
   * @return a string describing its name, current price and the change percentages.
   */
  @Override
  public String toString() {
    return String.format("%s Current Price: $ %.2f\n Gain/Loss: %.2f%%", getName(),
            getCurrentPrice(), getChangePercent() * 100);
  }
}



