#!/usr/bin/env groovy
package com
import com.JiraActionClass
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def install(String keyOrId, String comment) {

    JiraActionClass jiraAction = new JiraActionClass(keyOrId, [
            name: 'asdf',
            url: 'https://sdfwer.com',
            loginType: 'basic',
            timeout: 100
    ])
    stage ('Connect to Jira') {
        script { jiraAction.connect()}
    }
    stage('Leave the comment'){
        script {jiraAction.add_comment(comment)}
    }
}