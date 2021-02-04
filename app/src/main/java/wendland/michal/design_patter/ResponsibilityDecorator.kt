package wendland.michal.design_patter

abstract class ResponsibilityDecorator(protected var responsibility: ResponsibilityIfc) : ResponsibilityIfc {
    override fun execute() {
        responsibility.execute()
    }
}