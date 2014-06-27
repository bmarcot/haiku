// haiku.scala (c) 2014, Benoit Marcot
// a random Heroku-like name generator

import scala.util.Random.nextInt

val adjs = List("autumn", "hidden", "bitter", "misty", "silent",
  "empty", "dry", "dark", "summer", "icy", "delicate", "quiet", "white", "cool",
  "spring", "winter", "patient", "twilight", "dawn", "crimson", "wispy",
  "weathered", "blue", "billowing", "broken", "cold", "damp", "falling",
  "frosty", "green", "long", "late", "lingering", "bold", "little", "morning",
  "muddy", "old", "red", "rough", "still", "small", "sparkling", "throbbing",
  "shy", "wandering", "withered", "wild", "black", "holy", "solitary",
  "fragrant", "aged", "snowy", "proud", "floral", "restless", "divine",
  "polished", "purple", "lively", "nameless", "puffy", "fluffy",
  "calm", "young", "golden", "avenging", "ancestral", "ancient", "argent",
  "reckless", "daunting", "short", "rising", "strong", "timber", "tumbling",
  "silver", "dusty", "celestial", "cosmic", "crescent", "double", "far", "half",
  "inner", "milky", "northern", "southern", "eastern", "western", "outer",
  "terrestrial", "huge", "deep", "epic", "titanic", "mighty", "powerful")

val nouns = List("waterfall", "river", "breeze", "moon", "rain",
  "wind", "sea", "morning", "snow", "lake", "sunset", "pine", "shadow", "leaf",
  "dawn", "glitter", "forest", "hill", "cloud", "meadow", "glade",
  "bird", "brook", "butterfly", "bush", "dew", "dust", "field",
  "flower", "firefly", "feather", "grass", "haze", "mountain", "night", "pond",
  "darkness", "snowflake", "silence", "sound", "sky", "shape", "surf",
  "thunder", "violet", "wildflower", "wave", "water", "resonance",
  "sun", "wood", "dream", "cherry", "tree", "fog", "frost", "voice", "paper",
  "frog", "smoke", "star", "sierra", "castle", "fortress", "tiger", "day",
  "sequoia", "cedar", "wrath", "blessing", "spirit", "nova", "storm", "burst",
  "protector", "drake", "dragon", "knight", "fire", "king", "jungle", "queen",
  "giant", "elemental", "throne", "game", "weed", "stone", "apogee", "bang",
  "cluster", "corona", "cosmos", "equinox", "horizon", "light", "nebula",
  "solstice", "spectrum", "universe", "magnitude", "parallax")

def getRandElt[A](xs: List[A]): A = xs.apply(nextInt(xs.size))

def getRandNumber(ra: Range): String = {
  (ra.head + nextInt(ra.end - ra.head)).toString
}

def haiku: String = {
  val xs = getRandNumber(1000 to 9999) :: List(nouns, adjs).map(getRandElt)
  xs.reverse.mkString("-")
}

print(haiku)

/*
println("")

for (i <- 1 to 25) println(haiku)

def checkUniqueness(xs: List[_]): Boolean = {
  if (xs.size - xs.distinct.size > 0) { Console.err.println(xs.diff(xs.distinct)); false }
  else true
}

checkUniqueness(adjs)
checkUniqueness(nouns)
*/
