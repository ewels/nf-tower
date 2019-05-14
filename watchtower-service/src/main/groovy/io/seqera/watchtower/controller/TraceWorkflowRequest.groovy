package io.seqera.watchtower.controller

import com.fasterxml.jackson.annotation.JsonSetter
import io.seqera.watchtower.domain.SummaryEntry
import io.seqera.watchtower.domain.Task
import io.seqera.watchtower.domain.Workflow
import io.seqera.watchtower.pogo.enums.TraceType

import java.time.Instant

import groovy.transform.ToString
import io.seqera.watchtower.domain.Progress

/**
 * Model a Trace workflow request
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@ToString
class TraceWorkflowRequest {

    Task task
    Workflow workflow

    Instant utcTime
    Progress progress
    List<SummaryEntry> summary

    TraceType getTraceType() {
        workflow ? TraceType.WORKFLOW : task ? TraceType.TASK : TraceType.INVALID
    }

    @JsonSetter('utcTime')
    void deserializeCompleteInstant(String utcTimestamp) {
        utcTime = utcTimestamp ? Instant.parse(utcTimestamp) : null
    }

}
