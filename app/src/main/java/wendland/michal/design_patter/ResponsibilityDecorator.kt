package wendland.michal.design_patter

open class ResponsibilityDecorator(protected var responsibility: ResponsibilityIfc) : ResponsibilityIfc {
    override fun execute() {
        responsibility.execute()
    }
}