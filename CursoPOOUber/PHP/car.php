<?php 

class Car{
  public $id;
  public $license; 
  public $driver;
  protected $passenger;

  function __construct($license, $driver) {
    $this->license = $license;
    $this->driver  = $driver;

  }

  public function printDataCar() {
    echo "
        \n Licencia: {$this->license} 
        \n Driver: {$this->driver->name} 
        \n Número de pasajeros: {$this->passenger}";
  }

  //Get y Set para Passenger
  public function getPassenger(){
    return $this->passenger;
  }

  public function setPassenger($passenger) {
    if ($passenger == 4) {
        $this->passenger = $passenger;
    }
    else {
        echo "Necesitas asignar 4 pasajeros";
    }
}

} 

?>