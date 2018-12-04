object Main {

  class Switch(val isOn: Boolean)

  def toggle(switch: Switch): Switch =  new Switch(!switch.isOn)
  

}
