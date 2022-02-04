#!/usr/bin/env groovy

package com
import org.thoughtslive.jenkins.plugins.jira.steps.AddCommentStep

class JiraActionClass {
    static def add_comment(String comment, String id) {
        def comment_object = new AddCommentStep(comment, id)
        return comment_object.start()
    }
}
