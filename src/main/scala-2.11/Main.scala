object Main {

  case class Switch(isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) Switch(false) else Switch(true)
  }


  sealed abstract class SwitchState()
  case class On() extends SwitchState
  case class Off() extends SwitchState

  def toggle(state:  SwitchState): SwitchState = state match {
    case On() => Off()
    case Off() => On()
  }
}
