package practice;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;
    public Car(double fuelCost, double fuelAmount) {
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }
    // コンストラクタを作成
  public void move(int km) {
	  System.out.println(km + "km走ります");
	  this.fuelAmount -= (km / fuelCost);
  }
    // moveメソッド
    // ・"xx km 走ります"を出力
    // ・残量を計算
    public double getFuelAmount() {
    	return this.fuelAmount;
    }
    // fuelAmountを取得するメソッドを作成
}
