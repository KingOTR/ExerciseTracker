package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bookmarks.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bookmarks", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBookmarks", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bookmarks", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookmarksKt {
    private static ImageVector _bookmarks;

    public static final ImageVector getBookmarks(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 20.0f);
        pathBuilder.lineTo(96.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 76.0f, 40.0f);
        pathBuilder.lineTo(76.0f, 60.0f);
        pathBuilder.lineTo(64.0f, 60.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 80.0f);
        pathBuilder.lineTo(44.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.32f, 9.51f);
        pathBuilder.lineTo(108.0f, 199.14f);
        pathBuilder.lineToRelative(44.69f, 34.37f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 224.0f);
        pathBuilder.lineTo(172.0f, 177.6f);
        pathBuilder.lineToRelative(20.68f, 15.91f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 184.0f);
        pathBuilder.lineTo(212.0f, 40.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 192.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 199.63f);
        pathBuilder.lineToRelative(-32.69f, -25.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.63f, 0.0f);
        pathBuilder.lineTo(68.0f, 199.63f);
        pathBuilder.lineTo(68.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 159.63f);
        pathBuilder.lineTo(172.0f, 147.33f);
        pathBuilder.lineTo(172.0f, 80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(100.0f, 60.0f);
        pathBuilder.lineTo(100.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bookmarks = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
