package io.github.dostini.intellijbuttons

import com.intellij.openapi.actionSystem.ActionGroup
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class DocumentationPopup : ActionGroup() {
    override fun getChildren(e: AnActionEvent?): Array<AnAction> {
        return arrayOf(
            DocumentationLinkButton(DocumentationItem("React", "https://legacy.reactjs.org/docs/getting-started.html")),
            DocumentationLinkButton(DocumentationItem("SvelteKit", "https://kit.svelte.dev/docs/introduction")),
        )
    }
}