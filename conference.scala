case class Person(name: String)
case class Paper(title: String, authors: List[Person], body: String)

object ConofManagement: 
    type Viewers = Set [Person]

    class Conference(ratings: (Paper, Int)*):
        private val realScore = ratings.toMap

        def papers : List[Paper] = ratings.map(_._1).toList

        def score(paper: Paper, viewers: Viewers): Int = 
            if paper.authors.exists(viewers.contains) then -100
            else realScore(paper)

        def rakings(viewers: Viewers) : List[Paper] =
            papers.sortBy(score(_, viewers)).reserve

        def ask[T](p: Person, query: Viewers => T) =
            query(viewers + p)
    
    end Conference
end ConofManagement
