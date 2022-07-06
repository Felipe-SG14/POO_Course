<?php

  require_once('car.php');
  require_once('account.php');

  $car = new Car("ASD158",new Account("Andres","QFD168"));
  $car -> printDataCar();
?>