import sbt.*

object Dependencies {

  object Version {
    val scala        = "2.13.11"
    val zio          = "2.0.22"
    val config       = "4.0.1"
  }

  object ZIO {
    lazy val core = "dev.zio" %% "zio" % Version.zio
  }

//  object CONFIG {
//    lazy val core     = "dev.zio" %% "zio-config"          % Version.config
//    lazy val magnolia = "dev.zio" %% "zio-config-magnolia" % Version.config
//    lazy val typesafe = "dev.zio" %% "zio-config-typesafe" % Version.config
//    lazy val refined  = "dev.zio" %% "zio-config-refined"  % Version.config
//  }

  lazy val globalProjectDependencies = Seq(
    ZIO.core
//    ,
//    CONFIG.core,
//    CONFIG.magnolia,
//    CONFIG.typesafe,
//    CONFIG.refined
  )
}


