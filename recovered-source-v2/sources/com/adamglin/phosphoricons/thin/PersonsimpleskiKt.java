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

/* compiled from: Personsimpleski.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PersonSimpleSki", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPersonSimpleSki", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_personSimpleSki", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersonsimpleskiKt {
    private static ImageVector _personSimpleSki;

    public static final ImageVector getPersonSimpleSki(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(172.0f, 84.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 172.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 44.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.88f, 83.84f);
        pathBuilder.lineToRelative(112.0f, 32.65f);
        pathBuilder.lineToRelative(6.33f, 6.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(161.66f, 116.0f);
        pathBuilder.lineTo(130.83f, 85.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-12.0f, 12.0f);
        pathBuilder.lineToRelative(-72.05f, -21.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.24f, 7.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 93.65f);
        pathBuilder.lineToRelative(11.07f, 11.08f);
        pathBuilder.lineToRelative(-17.14f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.22f, 200.92f);
        pathBuilder.arcToRelative(65.8f, 65.8f, 0.0f, false, true, -55.0f, 8.43f);
        pathBuilder.lineTo(22.88f, 163.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.24f, -7.68f);
        pathBuilder.lineToRelative(78.27f, 22.79f);
        pathBuilder.lineToRelative(33.0f, -33.0f);
        pathBuilder.lineTo(86.9f, 131.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.2f, -7.69f);
        pathBuilder.lineToRelative(56.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.73f, 6.67f);
        pathBuilder.lineTo(112.15f, 181.5f);
        pathBuilder.lineToRelative(69.28f, 20.17f);
        pathBuilder.arcToRelative(57.81f, 57.81f, 0.0f, false, false, 48.35f, -7.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, 6.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _personSimpleSki = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
