#!/usr/bin/env groovy
package com
import com.JiraActionClass

def install(String keyOrId, String comment) {

    stage ('add comment') {
        script
                {
                    comment = JiraActionClass.add_comment(comment, keyOrId)
                    println("comment object is: ${comment}")
                }
    }
}