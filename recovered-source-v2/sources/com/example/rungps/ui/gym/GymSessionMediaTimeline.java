package com.example.rungps.ui.gym;

import com.example.rungps.data.SpotifyTimelineEntity;
import com.example.rungps.media.SessionMediaSnapshot;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GymSessionMediaTimeline.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0006¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/ui/gym/GymSessionMediaTimeline;", "", "<init>", "()V", "historyRows", "", "Lcom/example/rungps/data/SpotifyTimelineEntity;", "rows", "grouped", "matchesSnapshot", "", "row", "snap", "Lcom/example/rungps/media/SessionMediaSnapshot;", "isPodcastRow", "e", "displayTitle", "", "entry", "displaySubtitle", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionMediaTimeline {
    public static final int $stable = 0;
    public static final GymSessionMediaTimeline INSTANCE = new GymSessionMediaTimeline();

    private GymSessionMediaTimeline() {
    }

    public final List<SpotifyTimelineEntity> historyRows(List<SpotifyTimelineEntity> rows) {
        String itemId;
        String title;
        Intrinsics.checkNotNullParameter(rows, "rows");
        ArrayList arrayList = new ArrayList();
        for (Object obj : rows) {
            SpotifyTimelineEntity spotifyTimelineEntity = (SpotifyTimelineEntity) obj;
            if (spotifyTimelineEntity.isPlaying() || Intrinsics.areEqual(spotifyTimelineEntity.getItemType(), "episode") || INSTANCE.isPodcastRow(spotifyTimelineEntity) || (((itemId = spotifyTimelineEntity.getItemId()) != null && StringsKt.startsWith$default(itemId, "device:", false, 2, (Object) null)) || ((title = spotifyTimelineEntity.getTitle()) != null && !StringsKt.isBlank(title)))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<SpotifyTimelineEntity> grouped(List<SpotifyTimelineEntity> rows) {
        SpotifyTimelineEntity spotifyTimelineEntity;
        Intrinsics.checkNotNullParameter(rows, "rows");
        List createListBuilder = CollectionsKt.createListBuilder();
        for (SpotifyTimelineEntity spotifyTimelineEntity2 : INSTANCE.historyRows(rows)) {
            if (Intrinsics.areEqual(spotifyTimelineEntity != null ? spotifyTimelineEntity.getItemId() : null, spotifyTimelineEntity2.getItemId())) {
                if (Intrinsics.areEqual(spotifyTimelineEntity != null ? spotifyTimelineEntity.getTitle() : null, spotifyTimelineEntity2.getTitle())) {
                    spotifyTimelineEntity = Intrinsics.areEqual(spotifyTimelineEntity != null ? spotifyTimelineEntity.getSubtitle() : null, spotifyTimelineEntity2.getSubtitle()) ? spotifyTimelineEntity2 : null;
                }
            }
            createListBuilder.add(spotifyTimelineEntity2);
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final boolean matchesSnapshot(SpotifyTimelineEntity row, SessionMediaSnapshot snap) {
        Intrinsics.checkNotNullParameter(row, "row");
        Intrinsics.checkNotNullParameter(snap, "snap");
        return Intrinsics.areEqual(row.getItemId(), snap.getItemId()) && Intrinsics.areEqual(row.getTitle(), snap.getTitle()) && Intrinsics.areEqual(row.getSubtitle(), snap.getSubtitle());
    }

    public final boolean isPodcastRow(SpotifyTimelineEntity e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (Intrinsics.areEqual(e.getItemType(), "episode")) {
            return true;
        }
        String subtitle = e.getSubtitle();
        return (subtitle == null || StringsKt.isBlank(subtitle) || StringsKt.equals(e.getSubtitle(), e.getTitle(), true)) ? false : true;
    }

    public final String displayTitle(SpotifyTimelineEntity entry) {
        String obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        String title = entry.getTitle();
        if (title != null && (obj = StringsKt.trim((CharSequence) title).toString()) != null) {
            if (StringsKt.isBlank(obj)) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return "Unknown";
    }

    public final String displaySubtitle(SpotifyTimelineEntity entry) {
        String obj;
        String obj2;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!isPodcastRow(entry)) {
            String subtitle = entry.getSubtitle();
            if (subtitle == null || (obj2 = StringsKt.trim((CharSequence) subtitle).toString()) == null || StringsKt.isBlank(obj2)) {
                return null;
            }
            return obj2;
        }
        String subtitle2 = entry.getSubtitle();
        if (subtitle2 == null || (obj = StringsKt.trim((CharSequence) subtitle2).toString()) == null) {
            return null;
        }
        if (StringsKt.isBlank(obj)) {
            obj = null;
        }
        if (obj == null || StringsKt.equals(obj, displayTitle(entry), true)) {
            return null;
        }
        return obj;
    }
}
