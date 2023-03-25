package io.github.dostini.intellijbuttons

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory
import com.intellij.ui.jcef.JBCefBrowser

class WebViewToolWindowFactory(private val item: DocumentationItem) : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val component = JBCefBrowser(item.url).component
        toolWindow.contentManager.addContent(
            ContentFactory.SERVICE.getInstance().createContent(component, item.text, false)
        )
    }
}