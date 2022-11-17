package com.force5.platform.common.dto


import groovy.transform.ToString
import groovy.transform.CompileStatic

@ToString(includeNames=true,includeFields=true)
abstract class AbstractDTO {
    Long id
}
