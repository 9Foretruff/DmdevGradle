package com.foretruff.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        addHelloTask(target)
    }

    static void addHelloTask(Project target) {
        def map = [description: "hello task", group: "foretruff", type: DefaultTask]
        target.task(map, "hello") {
            println "hello task"
            doLast {
                println "execution phase, Action 1 "
            }
            doFirst {
                println "execution phase, Action 2 "
            }
            doLast {
                println "execution phase, Action 3 "
            }
            println "task: $description , group: $group , actions: ${actions.size()}"
        }
    }

}
