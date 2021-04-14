package com.github.keipa.jetbrainsguidplugin.services

import com.github.keipa.jetbrainsguidplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
