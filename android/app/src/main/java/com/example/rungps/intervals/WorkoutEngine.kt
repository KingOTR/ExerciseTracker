package com.example.rungps.intervals

class WorkoutEngine(private val plan: WorkoutPlan) {
    private var idx = 0
    private var done = false
    private var segmentStartElapsedMs = 0L
    private var segmentStartDistanceM = 0.0
    private var lastIntervalEndCueSecond: Int? = null

    fun start(totalElapsedMs: Long, totalDistanceM: Double): List<Cue> {
        idx = 0
        done = false
        segmentStartElapsedMs = totalElapsedMs
        segmentStartDistanceM = totalDistanceM
        lastIntervalEndCueSecond = null
        val first = plan.segments[idx]
        return listOf(Cue.Speak(first.label)) + first.cues
    }

    fun onUpdate(totalElapsedMs: Long, totalDistanceM: Double): Pair<WorkoutProgress, List<Cue>> {
        if (done) {
            return progress(totalElapsedMs, totalDistanceM) to emptyList()
        }

        val segment = plan.segments[idx]
        val elapsedInSegment = (totalElapsedMs - segmentStartElapsedMs).coerceAtLeast(0L)
        val distanceInSegment = (totalDistanceM - segmentStartDistanceM).coerceAtLeast(0.0)

        val (segmentComplete, remainingMs, remainingM) = when (val target = segment.target) {
            is SegmentTarget.TimeMs -> {
                val remaining = target.ms - elapsedInSegment
                Triple(remaining <= 0, remaining.coerceAtLeast(0L), null)
            }
            is SegmentTarget.DistanceM -> {
                val remaining = target.meters - distanceInSegment
                Triple(remaining <= 0.0, null, remaining.coerceAtLeast(0.0))
            }
        }

        val cues = mutableListOf<Cue>()
        if (segment.target is SegmentTarget.TimeMs && remainingMs != null) {
            val seconds = (remainingMs / 1000).toInt()
            if (seconds in 1..3 && (lastIntervalEndCueSecond == null || lastIntervalEndCueSecond != seconds)) {
                lastIntervalEndCueSecond = seconds
                cues += when (seconds) {
                    2 -> Cue.Beep(Cue.Beep.Pattern.IntervalEndTwo)
                    3 -> Cue.Beep(Cue.Beep.Pattern.IntervalEndOne)
                    else -> Cue.Beep(Cue.Beep.Pattern.IntervalEndThree)
                }
            }
        }

        if (segmentComplete) {
            idx++
            lastIntervalEndCueSecond = null
            if (idx >= plan.segments.size) {
                done = true
                cues += Cue.Speak("Workout complete")
            } else {
                if (plan.segments[idx].target is SegmentTarget.TimeMs) {
                    cues += Cue.Beep(Cue.Beep.Pattern.IntervalStartThree)
                    cues += Cue.Beep(Cue.Beep.Pattern.IntervalStartTwo)
                    cues += Cue.Beep(Cue.Beep.Pattern.IntervalStartOne)
                }
                segmentStartElapsedMs = totalElapsedMs
                segmentStartDistanceM = totalDistanceM
                val next = plan.segments[idx]
                cues += Cue.Speak(next.label)
                cues += next.cues
            }
        }

        val progress = WorkoutProgress(
            segmentIndex = idx.coerceAtMost(plan.segments.lastIndex),
            segmentElapsedMs = elapsedInSegment,
            segmentRemainingMs = remainingMs,
            segmentDistanceM = distanceInSegment,
            segmentRemainingM = remainingM,
            finished = done,
        )
        return progress to cues
    }

    private fun progress(totalElapsedMs: Long, totalDistanceM: Double): WorkoutProgress {
        val elapsedInSegment = (totalElapsedMs - segmentStartElapsedMs).coerceAtLeast(0L)
        val distanceInSegment = (totalDistanceM - segmentStartDistanceM).coerceAtLeast(0.0)
        return WorkoutProgress(
            segmentIndex = plan.segments.lastIndex,
            segmentElapsedMs = elapsedInSegment,
            segmentRemainingMs = 0L,
            segmentDistanceM = distanceInSegment,
            segmentRemainingM = 0.0,
            finished = true,
        )
    }
}
