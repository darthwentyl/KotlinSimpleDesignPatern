package wendland.michal.design_patter

class ChristmasResponsibilityVisitor : ResponsibilityVisitor {
    override fun visit(item: BaseResponsibility) {
        if (item.executionDay == 24) {
            item.execute()
        }
    }

    // z zalozenia wazne zadania sa w ostatniej chwili dodane 24 grudnia
    override fun visit(item: ImportantResponsibility) {
        item.execute()
    }
}