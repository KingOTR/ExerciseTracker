package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bookmarksimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BookmarkSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBookmarkSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bookmarkSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookmarksimpleKt {
    private static ImageVector _bookmarkSimple;

    public static final ImageVector getBookmarkSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bookmarkSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BookmarkSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 36.0f);
        pathBuilder.lineTo(72.0f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 48.0f);
        pathBuilder.lineTo(60.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, 3.39f);
        pathBuilder.lineTo(128.0f, 188.72f);
        pathBuilder.lineToRelative(61.89f, 38.67f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 228.0f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, 1.94f, -0.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 196.0f, 224.0f);
        pathBuilder.lineTo(196.0f, 48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 216.78f);
        pathBuilder.lineTo(130.11f, 180.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.24f, 0.0f);
        pathBuilder.lineTo(68.0f, 216.78f);
        pathBuilder.lineTo(68.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(184.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bookmarkSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
