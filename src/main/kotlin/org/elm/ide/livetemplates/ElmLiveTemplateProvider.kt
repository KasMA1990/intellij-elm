package org.elm.ide.livetemplates

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

// TODO(cies): replace DefaultLiveTemplatesProvider with DefaultLiveTemplateEP
class ElmLiveTemplateProvider : DefaultLiveTemplatesProvider {
    override fun getDefaultLiveTemplateFiles(): Array<out String> = arrayOf("liveTemplates/Elm")

    override fun getHiddenLiveTemplateFiles(): Array<out String>? = null
}
