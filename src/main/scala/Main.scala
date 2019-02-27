object Main {

  case  class Switch(isOn: Boolean)

  def toggle(switch: Switch): Switch = Switch(!switch.isOn)

}
