package wendland.michal.design_patter

class ImportantResponsibility(responsibility: ResponsibilityIfc)
    : ResponsibilityDecorator(responsibility) {
    override fun execute() {
        print("IMPORTANT ----> ")
        super.execute()
    }

    override fun accept(visitor: ResponsibilityVisitor) {
        visitor.visit(this)
    }
}