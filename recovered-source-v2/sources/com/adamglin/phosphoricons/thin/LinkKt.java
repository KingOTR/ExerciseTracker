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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.LINK, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLink", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_link", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 88.12f);
        pathBuilder.arcToRelative(50.44f, 50.44f, 0.0f, false, true, -14.81f, 34.31f);
        pathBuilder.lineToRelative(-34.75f, 34.74f);
        pathBuilder.arcTo(50.33f, 50.33f, 0.0f, false, true, 150.62f, 172.0f);
        pathBuilder.horizontalLineToRelative(-0.05f);
        pathBuilder.arcTo(50.63f, 50.63f, 0.0f, false, true, 100.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.89f);
        pathBuilder.horizontalLineToRelative(0.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.89f, 4.11f);
        pathBuilder.arcTo(42.64f, 42.64f, 0.0f, false, false, 150.58f, 164.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(42.32f, 42.32f, 0.0f, false, false, 30.14f, -12.49f);
        pathBuilder.lineToRelative(34.75f, -34.74f);
        pathBuilder.arcToRelative(42.63f, 42.63f, 0.0f, true, false, -60.29f, -60.28f);
        pathBuilder.lineToRelative(-11.0f, 11.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.65f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.arcTo(50.64f, 50.64f, 0.0f, false, true, 236.0f, 88.12f);
        pathBuilder.close();
        pathBuilder.moveTo(111.78f, 188.49f);
        pathBuilder.lineToRelative(-11.0f, 11.0f);
        pathBuilder.arcTo(42.33f, 42.33f, 0.0f, false, true, 70.6f, 212.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(42.63f, 42.63f, 0.0f, false, true, -30.11f, -72.77f);
        pathBuilder.lineToRelative(34.75f, -34.74f);
        pathBuilder.arcTo(42.63f, 42.63f, 0.0f, false, true, 148.0f, 135.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.23f);
        pathBuilder.arcTo(50.64f, 50.64f, 0.0f, false, false, 69.55f, 98.83f);
        pathBuilder.lineTo(34.8f, 133.57f);
        pathBuilder.arcTo(50.63f, 50.63f, 0.0f, false, false, 70.56f, 220.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(50.33f, 50.33f, 0.0f, false, false, 35.81f, -14.83f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.65f, -5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _link = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
