package com.force5.platform.common.dto.user

import com.force5.platform.common.dto.AbstractDTO
import groovy.transform.CompileStatic
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@EqualsAndHashCode
@CompileStatic
@TupleConstructor(includeSuperProperties = true )
class UserDTO extends AbstractDTO {
    String username
}
