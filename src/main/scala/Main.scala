import zio.Console._
import zio.ZIOAppDefault

object Main extends ZIOAppDefault {

  def run = mainLogic

  val mainLogic =
    for {
      _    <- printLine("Lets check it")
      name <- readLine
      _    <- printLine(s"Salam, $name, welcome to ZIO!")
    } yield ()
}
