#!/usr/bin/env groovy
package com
import com.JiraActionClass
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def install(String keyOrId, String comment) {

    JiraActionClass jiraAction = new JiraActionClass(keyOrId)
    stage ('Connect to Jira') {
        script { jiraAction.connect('https://sdf.com', 'name')}
    }
    stage('Leave the comment'){
        script {jiraAction.add_comment(comment)}
    }
}