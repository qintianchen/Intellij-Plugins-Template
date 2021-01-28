package com.github.qintianchen.intellijpluginstemplate.services

import com.github.qintianchen.intellijpluginstemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
