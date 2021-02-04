package wendland.michal.design_patter

import java.lang.StringBuilder

class BaseResponsibility(val name: String,
                         val executionTime: Int,
                         val executionDay: Int,
                         val whoExecute: String) : ResponsibilityIfc {

    override fun execute() {
        val msg = StringBuilder()
        msg.append(name + "; ")

        if (executionDay != 0) {
            var strDay = "execution day: $executionDay; "
            msg.append(strDay)
        }
        if (executionTime != 0) {
            var strTime = "execution time: $executionTime; "
            msg.append(strTime)
        }
        if (whoExecute.isNotEmpty()) {
            var strWho = "$whoExecute; "
            msg.append(strWho)
        }
        msg.append("----> Execute")
        println(msg.toString())
    }
}