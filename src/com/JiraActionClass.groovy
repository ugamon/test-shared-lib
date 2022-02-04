#!/usr/bin/env groovy

package com

import org.thoughtslive.jenkins.plugins.jira.Site
import org.thoughtslive.jenkins.plugins.jira.service.JiraService


class JiraActionClass {
    private JiraService jira_service
    private String idOrKey


    JiraActionClass(String idOrKey){
        this.idOrKey = idOrKey
    }

    def connect(String url, String name){
        URL _url = new URL(url)
        def jira_site = new Site('name', _url, 'basic', 100)
        this.jira_service = jira_site.getService()

    }

    def add_comment(String comment){
        this.jira_service.addComment(idOrKey=this.idOrKey, comment)
    }
}
