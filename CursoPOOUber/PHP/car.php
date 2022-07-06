<?php 

class Car{
  public $id;
  public $license; 
  public $driver;
  public $passenger;

  function __construct($license, $driver) {
    $this->license = $license;
    $this->driver  = $driver;

  }

  public function printDataCar()
  {
    echo "{$this->driver->name} y {$this->driver->document}";
  }

} 

?>