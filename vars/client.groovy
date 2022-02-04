#!/usr/bin/env groovy
package com
import com.JiraActionClass
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def install(String keyOrId, String comment) {

    JiraActionClass jiraAction = JiraActionClass('IDR-1', [
            name: '',
            url: '',
            loginType: '',
            timeout: 100
    ])
    stage ('Connect to Jira') {
        script { jiraAction.connect()}
    }
    stage('Leave the comment'){
        script {jiraAction.add_comment('Test comment')}
    }
}