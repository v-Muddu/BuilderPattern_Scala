object BuilderPatternImp {
  abstract class TRUE
  abstract class FALSE

  class VehicleBuilderImp[HM, HC, HA](val model : Option[String])
}
