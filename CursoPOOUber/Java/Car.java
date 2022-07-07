public class Car {

  // Si no se encapsula en Java, automaticamente se define como default
  Integer id;
  String  license;
  Account driver;
  protected Integer passenger;

  //Metodo constructor
  public Car(String license, Account driver){
    this.driver  = driver;
    this.license = license;
  }

  public void printDataCar() {
    if(passenger != null)
    {
      System.out.println("License: " + license + " Driver:" + driver.name + " Passengers: " + passenger);
    }
  }

  //Getters y Setters
  public Integer getPassenger(){
    return passenger;
  }

  public void setPassenger(Integer passenger){
    if (passenger == 4){
      this.passenger = passenger;
    }
    else{
      System.out.println("Necesitas asignar 4 pasajeros...");
    }
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLicense() {
    return license;
  }

  public void setLicense(String license) {
    this.license = license;
  }

  public Account getDriver() {
    return driver;
  }

  public void setDriver(Account driver) {
    this.driver = driver;
  }

  

}
