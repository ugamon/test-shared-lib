#!/usr/bin/env groovy

package com
//import org.jenkinsci.plugins.workflow.steps.Step
import org.thoughtslive.jenkins.plugins.jira.steps.AddCommentStep

class JiraActionClass {
    void add_comment(String comment, String id) {
        new AddCommentStep(id, comment)
    }
}