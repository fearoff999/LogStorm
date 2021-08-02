package com.github.fearoff999.logstorm.services

import com.github.fearoff999.logstorm.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
