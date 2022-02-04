#!/usr/bin/env groovy

package com

import org.jenkinsci.plugins.pipeline.modeldefinition.Utils

//import org.jenkinsci.plugins.workflow.steps.Step
import org.thoughtslive.jenkins.plugins.jira.steps.AddCommentStep
//import org.thoughtslive.jenkins.plugins.jira.steps.TransitionIssueStep

class JiraActionClass {
    static def add_comment(String comment, String id) {
        def comment_object = new AddCommentStep(comment, id)
        return comment_object
    }
}
