package com.github.dominiklippl.jetmoco.services

import com.intellij.openapi.project.Project
import com.github.dominiklippl.jetmoco.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
