#!/usr/bin/env groovy
package com

class GlobalVars {
    static String foo = "bar"

    // refer to this in a pipeline using:
    //
    // import com.cleverbuilder.GlobalVars
    // println GlobalVars.foo
}