package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bookmarks.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bookmarks", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBookmarks", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bookmarks", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookmarksKt {
    private static ImageVector _bookmarks;

    public static final ImageVector getBookmarks(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bookmarks;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bookmarks", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 26.0f);
        pathBuilder.lineTo(96.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 82.0f, 40.0f);
        pathBuilder.lineTo(82.0f, 58.0f);
        pathBuilder.lineTo(64.0f, 58.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 72.0f);
        pathBuilder.lineTo(50.0f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.49f, 4.88f);
        pathBuilder.lineTo(112.0f, 191.37f);
        pathBuilder.lineToRelative(52.52f, 37.51f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 174.0f, 224.0f);
        pathBuilder.lineTo(174.0f, 180.8f);
        pathBuilder.lineToRelative(22.51f, 16.08f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 206.0f, 192.0f);
        pathBuilder.lineTo(206.0f, 40.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 212.34f);
        pathBuilder.lineToRelative(-46.52f, -33.22f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.0f, 0.0f);
        pathBuilder.lineTo(62.0f, 212.34f);
        pathBuilder.lineTo(62.0f, 72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 180.34f);
        pathBuilder.lineTo(174.0f, 166.06f);
        pathBuilder.lineTo(174.0f, 72.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(94.0f, 58.0f);
        pathBuilder.lineTo(94.0f, 40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bookmarks = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
