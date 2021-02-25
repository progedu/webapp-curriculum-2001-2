object Main {

  class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) new Switch(false) else new Switch(true)
  }

}
