object Main {

  case class Switch(isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    switch.isOn match {
      case false => Switch(true)
      case true => Switch(false)
    }
  }

}