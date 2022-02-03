#!/usr/bin/env groovy

package com
//import org.jenkinsci.plugins.workflow.steps.Step
//import org.thoughtslive.jenkins.plugins.jira.steps.AddCommentStep
//import org.thoughtslive.jenkins.plugins.jira.steps.TransitionIssueStep

class JiraActionClass {
    void add_comment(String comment, String id) {
        new TransitionIssueStep('id', [transition: [id: 1]])
    }
}