package org.yesworkflow.annotations;

import org.yesworkflow.YWKeywords;

public class Param extends In {

    public Param(Long id, Long sourceId, Long lineNumber, String comment) throws Exception {        
        super(id, sourceId, lineNumber, comment, YWKeywords.Tag.PARAM);
    }
}
