package api

object API {

  type Something[EP[_ <: String]] = example.Something[EP, String]

}
