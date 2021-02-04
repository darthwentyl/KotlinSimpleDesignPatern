package wendland.michal.design_patter

import io.kotest.core.spec.style.StringSpec

class ExampleUnitTest: StringSpec({
    "Execute responsibilities" {
        var resposibilities  = listOf(
            ResponsibilityBuilder().setExecutionDay(21).setExecutionTime(1).setName("Wyrzucic smieci").setWhoExecute("Michal").build(),
            ResponsibilityBuilder().setExecutionDay(20).setExecutionTime(12).setName("Zrobic ciasto").setWhoExecute("Dominika").build(),
            ResponsibilityBuilder().setExecutionDay(24).setExecutionTime(32).setName("Ubrac choinke").setWhoExecute("Hubert").build(),
            ResponsibilityBuilder().setExecutionDay(13).setExecutionTime(12).setName("Posprzatac").build(),
            ResponsibilityBuilder().setName("Umyc podloge").build(),
            ImportantResponsibility(ResponsibilityBuilder().setName("Pakowanie prezentow").setExecutionDay(24).build())
        )

        resposibilities.forEach{
            it.execute()
        }

        println()
        println("------------------------------------------------------------------")
        println()

        // Visitor
        var visitor = ChristmasResponsibilityVisitor()
        resposibilities.forEach{
            it.accept(visitor)
        }
    }
})
{
}