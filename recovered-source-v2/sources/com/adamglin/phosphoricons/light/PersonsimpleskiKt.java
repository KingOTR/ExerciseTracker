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

/* compiled from: Personsimpleski.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSki", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPersonSimpleSki", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSki", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleskiKt {
    private static ImageVector _personSimpleSki;

    public static final ImageVector getPersonSimpleSki(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _personSimpleSki;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PersonSimpleSki", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 86.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 172.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 46.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 172.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.32f, 85.76f);
        pathBuilder.lineToRelative(111.47f, 32.51f);
        pathBuilder.lineToRelative(6.0f, 6.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 126.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(162.49f, 114.0f);
        pathBuilder.lineTo(132.24f, 83.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f);
        pathBuilder.lineTo(112.59f, 94.92f);
        pathBuilder.lineTo(41.68f, 74.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.36f, 11.52f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 96.48f);
        pathBuilder.lineToRelative(4.14f, 4.14f);
        pathBuilder.lineToRelative(-6.41f, -1.87f);
        pathBuilder.close();
        pathBuilder.moveTo(235.33f, 202.58f);
        pathBuilder.arcToRelative(67.79f, 67.79f, 0.0f, false, true, -56.7f, 8.69f);
        pathBuilder.lineTo(22.32f, 165.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.36f, -11.52f);
        pathBuilder.lineToRelative(77.13f, 22.46f);
        pathBuilder.lineTo(132.55f, 147.0f);
        pathBuilder.lineToRelative(-46.2f, -13.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.3f, -11.54f);
        pathBuilder.lineToRelative(56.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.59f, 10.0f);
        pathBuilder.lineTo(116.0f, 180.52f);
        pathBuilder.lineToRelative(66.0f, 19.23f);
        pathBuilder.arcToRelative(55.79f, 55.79f, 0.0f, false, false, 46.68f, -7.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.66f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSki = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
