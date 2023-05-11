object Main {

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) Switch(false) else Switch(true)
  }

  case class Switch(val isOn: Boolean)

}
