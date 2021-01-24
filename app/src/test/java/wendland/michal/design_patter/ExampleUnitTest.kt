package wendland.michal.design_patter

import io.kotest.core.spec.style.StringSpec

class ExampleUnitTest: StringSpec({
    "Execute responsibilities" {
        val resposibilities  = listOf(
            ResponsibilityBuilder().setExecutionDay(1).setExecutionTime(2).setName("Wyrzuc smieci").setWhoExecute("Michal").build(),
            ResponsibilityBuilder().setExecutionDay(1).setExecutionTime(2).setName("Zrob ciasto").setWhoExecute("Dominika").build(),
            ResponsibilityBuilder().setExecutionDay(1).setExecutionTime(2).setName("Ubrac choinke").setWhoExecute("Hubert").build(),
            ResponsibilityBuilder().setExecutionDay(1).setExecutionTime(2).setName("Posprzatac").build(),
            ResponsibilityBuilder().setName("Umyc podloge").build()
        )

        val it = resposibilities.listIterator()
        while (it.hasNext()) {
            it.next().execute()
        }
    }
})
{
}