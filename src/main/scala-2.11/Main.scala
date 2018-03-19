object Main {

  class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    val ret = new Switch(switch.isOn)
    if (ret.isOn) ret.isOn = false else ret.isOn = true
    ret
  }

}
