import com.typesafe.config.ConfigFactory

object Main extends App {
  val config = ConfigFactory.load()

  println(config.getString("foo.bar"))
}
