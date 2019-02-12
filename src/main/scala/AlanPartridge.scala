object AlanPartridge extends App {
//
//  val relatedTerms = List("Partridge",
//                          "PearTree",
//                          "Chat",
//                          "Dan",
//                          "Toblerone",
//                          "Lynn",
//                          "AlphaPapa",
//                          "Nomad")
//
//  val listOfWords = List("Too", "from", "blah", "Lynn", "Nomad")
//
//  def speak(words: List[String]) : Unit = {
//    for(x <- listOfWords) {
//      if (relatedTerms.contains(x)) {
//        println("Mine's a pint!")
//      }
//    }
//  }
//  speak(relatedTerms)
//}


//  val relatedTerms = List("Partridge",
//    "PearTree",
//    "Chat",
//    "Dan",
//    "Toblerone",
//    "Lynn",
//    "AlphaPapa",
//    "Nomad")
//
//  val listOfWords = List("Too", "from", "blah")
//
//  def numberOfMarks () : String = {
//    var NumberOfMarks = exclamationMarkCounter(listOfWords)
//    "!" * NumberOfMarks
//  }
//
//  def exclamationMarkCounter (word : List[String]) : Int = {
//      relatedTerms.count(term=>listOfWords.contains(term))
//  }
//
//  if (exclamationMarkCounter(listOfWords) > 1){
//    println (s"Mines a pint${numberOfMarks()}")
//  }
//  else println("Lynn, I've pierced my foot on a spike!")
//
//
//}

val relatedTerms = List("Partridge",
  "PearTree",
  "Chat",
  "Dan",
  "Toblerone",
  "Lynn",
  "AlphaPapa",
  "Nomad")

val listOfWords = List("Too", "from", "blah","Lynn","Nomad","Dan","Chat")

def numberOfMarks (wordList : List[String]) : String = {
  var NumberOfMarks = exclamationMarkCounter(wordList)
  "!" * NumberOfMarks
}

def exclamationMarkCounter (word : List[String]) : Int = {
  relatedTerms.count(term=>listOfWords.contains(term))
}

if (exclamationMarkCounter(listOfWords) > 1){
  println (s"Mine's a pint${numberOfMarks(listOfWords)}")
}
else println("Lynn, I've pierced my foot on a spike!")

}
