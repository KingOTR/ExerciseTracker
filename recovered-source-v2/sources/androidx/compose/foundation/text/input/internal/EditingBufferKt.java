package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: EditingBuffer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m1147updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m5784getLengthimpl;
        int m5786getMinimpl = TextRange.m5786getMinimpl(j);
        int m5785getMaximpl = TextRange.m5785getMaximpl(j);
        if (TextRange.m5790intersects5zctL8(j2, j)) {
            if (TextRange.m5778contains5zctL8(j2, j)) {
                m5786getMinimpl = TextRange.m5786getMinimpl(j2);
                m5785getMaximpl = m5786getMinimpl;
            } else {
                if (TextRange.m5778contains5zctL8(j, j2)) {
                    m5784getLengthimpl = TextRange.m5784getLengthimpl(j2);
                } else if (TextRange.m5779containsimpl(j2, m5786getMinimpl)) {
                    m5786getMinimpl = TextRange.m5786getMinimpl(j2);
                    m5784getLengthimpl = TextRange.m5784getLengthimpl(j2);
                } else {
                    m5785getMaximpl = TextRange.m5786getMinimpl(j2);
                }
                m5785getMaximpl -= m5784getLengthimpl;
            }
        } else if (m5785getMaximpl > TextRange.m5786getMinimpl(j2)) {
            m5786getMinimpl -= TextRange.m5784getLengthimpl(j2);
            m5784getLengthimpl = TextRange.m5784getLengthimpl(j2);
            m5785getMaximpl -= m5784getLengthimpl;
        }
        return TextRangeKt.TextRange(m5786getMinimpl, m5785getMaximpl);
    }
}
