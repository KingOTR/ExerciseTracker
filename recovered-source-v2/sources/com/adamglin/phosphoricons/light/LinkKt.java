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
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Link.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {HttpHeaders.LINK, "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLink", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_link", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkKt {
    private static ImageVector _link;

    public static final ImageVector getLink(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(238.0f, 88.18f);
        pathBuilder.arcToRelative(52.42f, 52.42f, 0.0f, false, true, -15.4f, 35.66f);
        pathBuilder.lineToRelative(-34.75f, 34.75f);
        pathBuilder.arcTo(52.28f, 52.28f, 0.0f, false, true, 150.62f, 174.0f);
        pathBuilder.horizontalLineToRelative(-0.05f);
        pathBuilder.arcTo(52.63f, 52.63f, 0.0f, false, true, 98.0f, 119.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -5.84f);
        pathBuilder.horizontalLineToRelative(0.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.83f, 6.16f);
        pathBuilder.arcTo(40.62f, 40.62f, 0.0f, false, false, 150.58f, 162.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(40.4f, 40.4f, 0.0f, false, false, 28.73f, -11.9f);
        pathBuilder.lineToRelative(34.75f, -34.74f);
        pathBuilder.arcTo(40.63f, 40.63f, 0.0f, false, false, 156.63f, 57.9f);
        pathBuilder.lineToRelative(-11.0f, 11.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.arcToRelative(52.62f, 52.62f, 0.0f, false, true, 74.43f, 0.0f);
        pathBuilder.arcTo(52.83f, 52.83f, 0.0f, false, true, 238.0f, 88.18f);
        pathBuilder.close();
        pathBuilder.moveTo(110.38f, 187.08f);
        pathBuilder.lineTo(99.38f, 198.08f);
        pathBuilder.arcTo(40.36f, 40.36f, 0.0f, false, true, 70.6f, 210.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(40.63f, 40.63f, 0.0f, false, true, -28.7f, -69.36f);
        pathBuilder.lineTo(76.62f, 105.9f);
        pathBuilder.arcTo(40.63f, 40.63f, 0.0f, false, true, 146.0f, 135.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.83f, 6.16f);
        pathBuilder.lineTo(152.0f, 141.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -5.84f);
        pathBuilder.arcTo(52.63f, 52.63f, 0.0f, false, false, 68.14f, 97.42f);
        pathBuilder.lineTo(33.38f, 132.16f);
        pathBuilder.arcTo(52.63f, 52.63f, 0.0f, false, false, 70.56f, 222.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(52.26f, 52.26f, 0.0f, false, false, 37.22f, -15.42f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, -8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _link = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
