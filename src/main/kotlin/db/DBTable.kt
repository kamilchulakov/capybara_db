package db

data class DBTable(
    val name: String = "",
    val columns: List<String> = ArrayList(),
    val data: List<List<Double>> = ArrayList()
)