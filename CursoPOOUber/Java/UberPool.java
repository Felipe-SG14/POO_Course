public class UberPool extends Car{

  String brand;
  String model;

  public UberPool(String license, Account driver, String brand, String model){
    //Llmando al método constructor de la clase padre
    super(license, driver);
    this.brand = brand;
    this.model = model;

    //Atributos de la clase padre
    // super.driver

  }
  
}