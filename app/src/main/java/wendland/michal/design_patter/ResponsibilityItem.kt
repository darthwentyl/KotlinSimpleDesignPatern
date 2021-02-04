package wendland.michal.design_patter

interface ResponsibilityItem {
    fun accept(visitor: ResponsibilityVisitor)
}