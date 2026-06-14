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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.LINK, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLink", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_link", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _link;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder(HttpHeaders.LINK, Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(117.18f, 188.74f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineToRelative(-5.12f, 5.12f);
        pathBuilder.arcTo(58.26f, 58.26f, 0.0f, false, true, 70.6f, 228.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(58.62f, 58.62f, 0.0f, false, true, 29.14f, 127.92f);
        pathBuilder.lineTo(63.89f, 93.17f);
        pathBuilder.arcToRelative(58.64f, 58.64f, 0.0f, false, true, 98.56f, 28.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.37f, 5.44f);
        pathBuilder.arcToRelative(34.65f, 34.65f, 0.0f, false, false, -58.22f, -16.58f);
        pathBuilder.lineTo(46.11f, 144.89f);
        pathBuilder.arcTo(34.62f, 34.62f, 0.0f, false, false, 70.57f, 204.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(34.41f, 34.41f, 0.0f, false, false, 24.49f, -10.14f);
        pathBuilder.lineToRelative(5.11f, -5.12f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 117.18f, 188.74f);
        pathBuilder.close();
        pathBuilder.moveTo(226.83f, 45.17f);
        pathBuilder.arcToRelative(58.65f, 58.65f, 0.0f, false, false, -82.93f, 0.0f);
        pathBuilder.lineToRelative(-5.11f, 5.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(5.12f, -5.12f);
        pathBuilder.arcToRelative(34.63f, 34.63f, 0.0f, true, true, 49.0f, 49.0f);
        pathBuilder.lineTo(175.1f, 145.86f);
        pathBuilder.arcTo(34.39f, 34.39f, 0.0f, false, true, 150.61f, 156.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(34.63f, 34.63f, 0.0f, false, true, -33.69f, -26.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.38f, 5.44f);
        pathBuilder.arcTo(58.64f, 58.64f, 0.0f, false, false, 150.56f, 180.0f);
        pathBuilder.horizontalLineToRelative(0.05f);
        pathBuilder.arcToRelative(58.28f, 58.28f, 0.0f, false, false, 41.47f, -17.17f);
        pathBuilder.lineToRelative(34.75f, -34.75f);
        pathBuilder.arcToRelative(58.62f, 58.62f, 0.0f, false, false, 0.0f, -82.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _link = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
