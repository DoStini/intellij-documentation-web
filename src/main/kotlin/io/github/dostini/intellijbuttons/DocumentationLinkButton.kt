package io.github.dostini.intellijbuttons

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class DocumentationLinkButton(
    val text: String,
    val url: String,
) : AnAction() {
    init {
        val presentation = templatePresentation
        presentation.text = this.text
    }

    override fun actionPerformed(e: AnActionEvent) {
        println(url)
    }
}
