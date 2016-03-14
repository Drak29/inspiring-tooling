//resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6" exclude("org.slf4j", "slf4j-simple"))

// other plugins

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.4.6" exclude("org.slf4j", "slf4j-simple"))

// other plugins

// heroku
addSbtPlugin("com.heroku" % "sbt-heroku" % "1.0.0")
