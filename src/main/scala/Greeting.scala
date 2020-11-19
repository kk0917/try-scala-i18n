import com.example.i18n.{Messages, Lang, Localized}

object Greeting {
  def Hello(lang: String): Unit = {
    implicit val lang: Lang = Lang.Default

    println(Messages("greeting.hello"))
  }
}
