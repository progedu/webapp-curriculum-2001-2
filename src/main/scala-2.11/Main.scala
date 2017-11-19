object Main {

  case class CSwitch(isOn: Boolean)

  def toggle(switch: CSwitch): CSwitch = {
    if (switch.isOn) CSwitch(false) else CSwitch(true)
  }

}
