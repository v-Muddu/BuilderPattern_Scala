import BuilderPattern._
object Main {
  def main(args: Array[String]): Unit ={
    var bookVehicle = builder withModel("TeslaS")withColor ("RED")withBatteryUnit (90)withAutoPilot (true) build()
    println(bookVehicle.model)
  }
}