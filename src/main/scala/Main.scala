object Main {

  class Switch(var isOn: Boolean)

  def toggle(switch: Switch): Switch = {
    if (switch.isOn) switch(false) else switch(true)
  }

}
