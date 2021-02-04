package wendland.michal.design_patter

interface ResponsibilityVisitor {
    fun visit(item: BaseResponsibility)
    fun visit(item: ImportantResponsibility)
}