file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.0
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.0\scala3-library_3-3.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 53
uri: file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
text:
```scala
class Polynom (nonZeroTerms: Map[Int, Double]):
    v@@ terms = nonZeroTerms.withDefault(0.0)

    def + (other: Polynom): Polynom = ???

    override def 
```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition <error> is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/poly.scala
One of these files should be removed from the classpath.