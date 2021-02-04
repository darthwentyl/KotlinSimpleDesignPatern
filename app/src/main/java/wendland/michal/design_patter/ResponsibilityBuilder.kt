package wendland.michal.design_patter

class ResponsibilityBuilder {
    var name = String()
    var executionTime = 0
    var executionDay = 0
    var whoExecute = String()

    fun setName(name: String) : ResponsibilityBuilder {
        this.name = name
        return this
    }

    fun setExecutionTime(time: Int) : ResponsibilityBuilder {
        this.executionTime = time
        return this
    }

    fun setExecutionDay(day: Int) : ResponsibilityBuilder {
        this.executionDay = day
        return this
    }

    fun setWhoExecute(name: String) : ResponsibilityBuilder {
        this.whoExecute = name
        return this
    }

    fun build() : ResponsibilityIfc {
        return BaseResponsibility(name, executionTime, executionDay, whoExecute)
    }
}