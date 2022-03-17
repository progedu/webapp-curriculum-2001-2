object Main {

  case class Switch(isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) switch(false) else Switch(true)
  }

}
