#!/usr/bin/env groovy

package com

import org.thoughtslive.jenkins.plugins.jira.Site
import org.thoughtslive.jenkins.plugins.jira.service.JiraService


class JiraActionClass {
    private JiraService jira_service
    private String idOrKey
    private Map siteConfig


    JiraActionClass(String idOrKey, Map site_config){
        this.idOrKey = idOrKey
        this.siteConfig = site_config

    }

    def connect(){
        def jira = new Site()
        def jira_site = new Site(
                name=this.siteConfig.get('name'),
                url=this.siteConfig.get('url'),
                loginType=this.siteConfig.get('loginType'),
                timeout=this.siteConfig.get('timeout')
        )
        this.jira_service = jira_site.getService()

    }

    def add_comment(String comment){
        this.jira_service.addComment(idOrKey=this.idOrKey, comment)
    }
}
