public class Car {
  Integer id;
  String  license;
  Account driver;
  Integer passenger;

  //Metodo constructor
  public Car(String license, Account driver){
    this.driver  = driver;
    this.license = license;
  }

  public void printDataCar() {
    System.out.println("License: " + license + " Driver:" + driver.name);
  }

}
