package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.LINK, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLink", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_link", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(115.7f, 192.49f);
        pathBuilder.arcToRelative(43.31f, 43.31f, 0.0f, false, true, -55.0f, -66.43f);
        pathBuilder.lineToRelative(25.37f, -25.37f);
        pathBuilder.arcToRelative(43.35f, 43.35f, 0.0f, false, true, 61.25f, 0.0f);
        pathBuilder.arcToRelative(42.9f, 42.9f, 0.0f, false, true, 9.95f, 15.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.0f, 5.6f);
        pathBuilder.arcTo(27.33f, 27.33f, 0.0f, false, false, 97.37f, 112.0f);
        pathBuilder.lineTo(72.0f, 137.37f);
        pathBuilder.arcToRelative(27.32f, 27.32f, 0.0f, false, false, 34.68f, 41.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.0f, 13.21f);
        pathBuilder.close();
        pathBuilder.moveTo(195.31f, 129.94f);
        pathBuilder.lineTo(169.94f, 155.31f);
        pathBuilder.arcTo(43.0f, 43.0f, 0.0f, false, true, 139.32f, 168.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(43.35f, 43.35f, 0.0f, false, true, -40.53f, -28.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.6f);
        pathBuilder.arcTo(27.35f, 27.35f, 0.0f, false, false, 139.28f, 152.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(27.14f, 27.14f, 0.0f, false, false, 19.32f, -8.0f);
        pathBuilder.lineTo(184.0f, 118.63f);
        pathBuilder.arcToRelative(27.32f, 27.32f, 0.0f, false, false, -34.68f, -41.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.0f, -13.21f);
        pathBuilder.arcToRelative(43.32f, 43.32f, 0.0f, false, true, 55.0f, 66.43f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _link = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
