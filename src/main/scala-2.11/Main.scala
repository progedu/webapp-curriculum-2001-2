object Main {

  class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Switch = new Switch(!switch.isOn)

}
