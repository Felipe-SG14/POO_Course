import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{

  Map<String, Map<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;

  public UberVan(String license, Account driver, Map<String, Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial){
    //Llmando al método constructor de la clase padre
    super(license, driver);
    this.typeCarAccepted = typeCarAccepted;
    this.seatsMaterial   = seatsMaterial;

    //Atributos de la clase padre
    // super.driver

  }
  
}