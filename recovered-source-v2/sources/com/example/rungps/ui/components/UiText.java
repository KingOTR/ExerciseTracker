package com.example.rungps.ui.components;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiText.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\t\u001a\u00020\n*\u00020\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/ui/components/UiText;", "", "<init>", "()V", "Ellipsis", "Landroidx/compose/ui/text/style/TextOverflow;", "getEllipsis-gIe3tQ8", "()I", "I", "safeSingleLine", "Landroidx/compose/ui/Modifier;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UiText {
    public static final int $stable = 0;
    public static final UiText INSTANCE = new UiText();
    private static final int Ellipsis = TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8();

    public final Modifier safeSingleLine(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return modifier;
    }

    private UiText() {
    }

    /* renamed from: getEllipsis-gIe3tQ8, reason: not valid java name */
    public final int m7004getEllipsisgIe3tQ8() {
        return Ellipsis;
    }
}
