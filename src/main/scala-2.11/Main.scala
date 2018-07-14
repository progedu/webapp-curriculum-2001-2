object Main {

  case class Swith(var isOn:Boolean)

 def toggle(swith: Swith): Unit = {
      if (swith.isOn) Swith(false) else Swith(true)
  }
}
