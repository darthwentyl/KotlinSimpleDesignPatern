package wendland.michal.design_patter

class Responsibility(name: String, executionTime: Int, executionDay: Int, whoExecute: String) {
    val name = name
    val executionTime = executionTime
    val executionDay = executionDay
    val whoExecute = whoExecute

    fun execute() {
        println(name + ": Executed")
    }
}