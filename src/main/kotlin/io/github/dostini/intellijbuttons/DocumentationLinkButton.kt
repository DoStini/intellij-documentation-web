package io.github.dostini.intellijbuttons

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowAnchor
import com.intellij.openapi.wm.ToolWindowManager


class DocumentationLinkButton(private val item: DocumentationItem) : AnAction() {
    init {
        val presentation = templatePresentation
        presentation.text = this.item.text
    }

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return

        val toolWindowManager = ToolWindowManager.getInstance(project)
        var toolWindow: ToolWindow? = toolWindowManager.getToolWindow("Documentation")
        if (toolWindow == null) {
            toolWindow = toolWindowManager.registerToolWindow ("Documentation", true, ToolWindowAnchor.RIGHT)
        }

        WebViewToolWindowFactory(item)
            .createToolWindowContent(project, toolWindow)

        toolWindow.activate(null)
    }
}
