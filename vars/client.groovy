#!/usr/bin/env groovy
package com
import com.JiraActionClass
import org.jenkinsci.plugins.pipeline.modeldefinition.Utils


def install(String keyOrId, String comment) {

    stage ('add comment') {
        script
                {
                    comment = JiraActionClass.add_comment(comment, keyOrId)
                    println("comment object is: ${comment}")
                }
    }
}