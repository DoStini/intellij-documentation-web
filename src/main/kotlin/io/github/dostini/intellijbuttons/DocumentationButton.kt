package io.github.dostini.intellijbuttons

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.ui.popup.PopupFactoryImpl

class DocumentationButton: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        PopupFactoryImpl()
            .createActionGroupPopup(
                "Documentation Pages",
                DocumentationPopup(),
                e.dataContext,
                JBPopupFactory.ActionSelectionAid.SPEEDSEARCH,
                true)
            .showInFocusCenter()
    }
}
