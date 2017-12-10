import BuilderPattern.builder
import org.junit.{Assert, Test}

class BuilderTest {
  @Test def withOutModel: Unit = {
    var x = new Builder[Customer.Car.GetCar](Nil).withModel("Tesla S").withColor("Red").withAutoPilot.withBatteryUnit("90D").build
    Assert.assertNotNull(x)
  }

  @Test def withOuBuilder: Unit = {
    var bookVehicle = builder withModel("TeslaS")withColor ("RED")withBatteryUnit (90)withAutoPilot (true) build()
    Assert.assertNotNull(bookVehicle)
  }
}
