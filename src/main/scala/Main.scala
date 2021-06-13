object Main {

  class Switch(val isOn: Boolean)

  def toggle(switch: Switch): Unit = {
    new Switch(!switch.isOn)
  }

}
